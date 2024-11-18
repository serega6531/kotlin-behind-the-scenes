package berlin.kotlin.properties

val sameClassImmutable = 3
var sameClassMutable = 5

val withGetter: Int
    get() = 8

fun main() {
    println(sameClassImmutable)

    println(sameClassMutable)
    sameClassMutable = 10
    println(sameClassMutable)

    println(withGetter)

    println(AnotherClass().anotherClassImmutable)
}

private class AnotherClass {
    val anotherClassImmutable = 12
}