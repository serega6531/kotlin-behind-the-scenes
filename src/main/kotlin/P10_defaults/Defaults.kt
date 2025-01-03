package berlin.kotlin.defaults

fun main() {
    doSomething()
    doSomething(someBool = false)
    doSomething(someInt = 456)
}

fun doSomething(someInt: Int = 123, someBool: Boolean = true, someString: String = "abc") {
    println("$someInt $someBool $someString")
}
