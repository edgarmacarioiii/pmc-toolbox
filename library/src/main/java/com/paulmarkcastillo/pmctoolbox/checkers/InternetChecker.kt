package com.paulmarkcastillo.pmctoolbox.checkers

import kotlinx.coroutines.*
import java.io.IOException
import java.net.InetSocketAddress
import java.net.Socket

open class InternetChecker {
    private lateinit var internetCheckJob: Job

    open fun hasInternetAccess(callback: InternetAccessCallback) {
        internetCheckJob = GlobalScope.launch {
            withContext(Dispatchers.Main) {
                callback.onResult(checkInternetAccess().await())
            }
        }
    }

    fun cancelChecking() {
        if (::internetCheckJob.isInitialized && internetCheckJob.isActive) {
            internetCheckJob.cancel()
        }
    }

    private fun checkInternetAccess(): Deferred<Boolean> {
        return GlobalScope.async {
            try {
                val googleDns = "8.8.8.8"
                val dnsPort = 53
                val timeout = 5000
                val socket = Socket()
                val socketAddress = InetSocketAddress(googleDns, dnsPort)
                socket.connect(socketAddress, timeout)
                socket.close()
                true
            } catch (e: IOException) {
                e.printStackTrace()
                false
            }
        }
    }

    interface InternetAccessCallback {
        fun onResult(hasAccess: Boolean)
    }
}