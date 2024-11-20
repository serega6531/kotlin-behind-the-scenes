package berlin.kotlin.lambda

fun main() {
    testAnonymousClass()
    testIndy()
}

private fun testAnonymousClass() {
    val test = 2

    val a = @JvmSerializableLambda { num: Int -> println(num * test) } // before 2.0 or with -Xlambdas=class
    a(111)
}

private fun testIndy() {
    val test = 2

    val b = { num: Int -> println(num * test) }                        // since 2.0 or with -Xlambdas=indy
    b(222)
}