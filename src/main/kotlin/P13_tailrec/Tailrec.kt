package berlin.kotlin.tailrec

fun main() {
    val n = 5L

    println(factorialSimple(n))
    println(factorialSimpleTailrec(n))
    println(factorialWithAcc(n))
    println(factorialTailrec(n))

    val n2 = 100000L
    println(factorialSimple(n2))
}

private fun factorialSimple(n: Long): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorialSimple(n - 1)
    }
}

private tailrec fun factorialSimpleTailrec(n: Long): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorialSimpleTailrec(n - 1)
    }
}

private fun factorialWithAcc(n: Long, acc: Long = 1): Long {
    return if (n <= 1) {
        acc
    } else {
        factorialWithAcc(n - 1, n * acc)
    }
}

private tailrec fun factorialTailrec(n: Long, acc: Long = 1): Long {
    return if (n <= 1) {
        acc
    } else {
        factorialTailrec(n - 1, n * acc)
    }
}

