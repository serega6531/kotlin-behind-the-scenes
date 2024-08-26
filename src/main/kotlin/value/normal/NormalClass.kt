package berlin.kotlin.value.normal

fun main() {
    val email1 = Email("test@gmail.com")
    printHostname(email1)

    val email2 = Email("abc")
    printHostname(email2)
}

private fun printHostname(email: Email) {
    println(email.hostname)
}


private class Email(
    val value: String
) {
    init {
        require(value matches Regex(".+@.+")) { "$value is not a valid email" }
    }

    val hostname: String
        get() = value.split("@").last()
}