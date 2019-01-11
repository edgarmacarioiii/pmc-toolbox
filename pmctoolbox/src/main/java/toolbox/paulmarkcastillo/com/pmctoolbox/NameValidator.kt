package toolbox.paulmarkcastillo.com.pmctoolbox

class NameValidator {
    fun isValidName(name: String?): Boolean {
        return !name?.trim().isNullOrEmpty()
    }
}