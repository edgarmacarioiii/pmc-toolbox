package toolbox.paulmarkcastillo.com.pmctoolbox.validators

class NameValidator {
    fun isValidName(name: String?): Boolean {
        return !name?.trim().isNullOrEmpty()
    }
}