package berlin.kotlin.delegation

fun main() {
    val test = Test()
    test.printValue()
    test.printValue()
}

private class Test {

    private val value by lazy {
        Thread.sleep(3000)
        "abc"
    }

    fun printValue() {
        println(value)
    }

}