package berlin.kotlin.lambda

fun main() {
    val test = 2

    val a = { num: Int -> println(num * test) }                        // since 2.0 or with -Xlambdas=indy
    val b = @JvmSerializableLambda { num: Int -> println(num * test) } // before 2.0 or with -Xlambdas=class

    a(111)
    b(222)
}