package berlin.kotlin.defaults

fun main() {
    doSomethingWithOverloads()
    doSomethingWithOverloads(someBool = false)
    doSomethingWithOverloads(someInt = 456)
}

@JvmOverloads
fun doSomethingWithOverloads(someInt: Int = 123, someBool: Boolean = true, someString: String = "abc") {
    println("$someInt $someBool $someString")
}