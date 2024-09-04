package berlin.kotlin.lambda

fun main() {
    var counter = 1

    val lambda = { counter++ }

    lambda()

    println(counter)
}