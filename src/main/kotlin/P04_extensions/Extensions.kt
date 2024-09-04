package berlin.kotlin.extensions

fun main() {
    println(123.reversed())
    println(123.reversed)
}

private fun Int.reversed() = this.toString().reversed().toInt()

private val Int.reversed: Int
    get() = this.toString().reversed().toInt()