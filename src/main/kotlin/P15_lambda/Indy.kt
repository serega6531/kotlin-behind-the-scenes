package berlin.kotlin.lambda

fun main() {
    testAnonymousClass()
    testIndy()
}

private fun testAnonymousClass() {
    val a = @JvmSerializableLambda { println(123) } // before 2.0 or with -Xlambdas=class
    println(a)
    a()
}

private fun testIndy() {
    val b = { println(456) }                        // since 2.0 or with -Xlambdas=indy
    println(b)
    b()
}
