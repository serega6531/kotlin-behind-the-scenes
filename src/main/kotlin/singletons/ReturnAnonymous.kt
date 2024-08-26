package berlin.kotlin.singletons

fun main() {
    MyPrinter().printX()
}

class MyPrinter {
    private fun getObject() = object {
        fun printSomething() {
            println("abc")
        }
    }

    fun printX() {
        val tmp = getObject()
        tmp.printSomething()
    }
}