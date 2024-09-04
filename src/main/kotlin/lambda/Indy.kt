package berlin.kotlin.lambda

fun main() {
    val a = { println(123) }                        // since 2.0 or with -Xlambdas=indy
    val b = @JvmSerializableLambda { println(456) } // before 2.0 or with -Xlambdas=class

    println(a)
    println(b)

    a()
    b()
}