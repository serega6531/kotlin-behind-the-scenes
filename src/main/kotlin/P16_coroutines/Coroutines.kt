package berlin.kotlin.coroutines

import kotlinx.coroutines.delay

suspend fun main() {
    val a = first()
    val b = second()
    val sum = third(a, b)
    println(sum)
}

private suspend fun first(): String {
    delay(1000L)
    return "111"
}

private suspend fun second(): String {
    delay(1000L)
    return "222"
}

private suspend fun third(val1: String, val2: String): Int {
    delay(1000L)
    return val2.toInt() * 2 + val1.toInt()
}

