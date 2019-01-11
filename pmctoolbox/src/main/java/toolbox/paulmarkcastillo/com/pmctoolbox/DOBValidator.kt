package toolbox.paulmarkcastillo.com.pmctoolbox

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

class DOBValidator {
    // This regex check for valid date with a format of MM/dd/yyyy
    private val DATE_PATTERN = Pattern
        .compile(
            "^(?:(?:(?:0?[13578]|1[02])(\\/)31)\\1" +
                    "|(?:(?:0?[1,3-9]|1[0-2])(\\/)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{1,4})\$" +
                    "|^(?:0?2(\\/)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])" +
                    "|(?:(?:16|[2468][048]|[3579][26])00))))\$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/)(?:0?[1-9]" +
                    "|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{1,4})\$"
        )

    fun isValidDate(date: String?): Boolean {
        return !date.isNullOrEmpty() && DATE_PATTERN.matcher(date).matches()
    }

    fun isValidAge(strDate: String?): Boolean {
        val parseStrDate = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
        val formatDate = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        val birthDate = parseStrDate.parse(strDate)
        val currentDate = Calendar.getInstance().time
        val longBirthDate = (formatDate.format(birthDate)).toLong()
        val longCurrentDate = (formatDate.format(currentDate)).toLong()
        val age = (longCurrentDate - longBirthDate) / 10000
        return age >= 13
    }
}