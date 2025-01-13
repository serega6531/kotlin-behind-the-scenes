package berlin.kotlin.delegation

fun main() {
    val test = Test()
    println("Before")
    test.printValue()
    println("Between")
    test.printValue()
    println("After")
}

private class Test {

    private val calculated by lazy {
        Thread.sleep(3000)
        "abc"
    }

    fun printValue() {
        println(calculated)
    }

}