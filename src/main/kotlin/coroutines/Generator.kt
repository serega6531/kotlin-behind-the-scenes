package berlin.kotlin.coroutines

fun main() {
    fib.take(10).forEach(::println)
}

val fib = sequence {
    var first = 0
    var second = 1
    while (true) {
        yield(first)
        val temp = first
        first += second
        second = temp
    }
}