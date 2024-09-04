package berlin.kotlin.nullsafety

fun main() {
    testNullable("foo")
    testNonNullable("bar")
    testSafeNullable("baz")
}

fun testNullable(a: String?) {
    println(a)
}

fun testNonNullable(a: String) {
    println(a)
}

private fun testSafeNullable(a: String?) {
    println(a)
}