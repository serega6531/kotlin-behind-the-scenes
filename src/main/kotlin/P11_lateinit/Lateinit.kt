package berlin.kotlin.lateinit

private lateinit var example: String
// lateinit var example: String

fun main() {
    println(example)

    example = "Test"

    println(example)
}