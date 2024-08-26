package berlin.kotlin.defaults

fun main() {
    doSomething()
    doSomething(someBool = false)
    doSomething(someInt = 456)
    // TODO interop?
}

private fun doSomething(someInt: Int = 123, someBool: Boolean = true, someString: String = "abc") {
    println("$someInt $someBool $someString")
}

@JvmOverloads
fun doSomethingWithOverloads(someInt: Int = 123, someBool: Boolean = true, someString: String = "abc") {
    println("$someInt $someBool $someString")
}