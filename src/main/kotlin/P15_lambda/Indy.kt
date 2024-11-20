package berlin.kotlin.lambda

fun main() {
    val a = @JvmSerializableLambda { println(123) } // before 2.0 or with -Xlambdas=class
    println(a)
    a()

    val b = { println(456) }                        // since 2.0 or with -Xlambdas=indy
    println(b)
    b()
}