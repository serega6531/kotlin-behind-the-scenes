package berlin.kotlin.value.updated

fun main() {
    val email1 = Email("test@gmail.com")
    printHostname(email1)

    val email2 = Email("abc")
    printHostname(email2)
}

private fun printHostname(email: Email) {
    println(email.hostname)
}
