package berlin.kotlin.lambda

fun main() {
    testReified<Int>()
    testReified<String>()
}

//private fun <T> testNonReified() {
//    println("My type is ${T::class}")
//}

private inline fun <reified T> testReified() {
    println("My type is ${T::class}")
}

