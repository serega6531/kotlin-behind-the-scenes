package berlin.kotlin.defaults

@JvmOverloads
fun doSomethingWithOverloads(someInt: Int = 123, someBool: Boolean = true, someString: String = "abc") {
    println("$someInt $someBool $someString")
}