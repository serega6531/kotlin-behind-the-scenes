package berlin.kotlin.properties

val sameClassImmutable = 3
var sameClassMutable = 5

fun main() {
    println(sameClassImmutable)

    println(sameClassMutable)
    sameClassMutable = 10
    println(sameClassMutable)
}

class MyValues {

}