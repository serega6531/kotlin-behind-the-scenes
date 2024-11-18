package berlin.kotlin.companion

fun main() {
    println(Outer.first + Outer.second + Outer.third + Outer.fourth)
}

class Outer {

    companion object {

        val first = "Hello"

        @JvmStatic
        val second = ", "

        @JvmField
        val third = "world"

        const val fourth = "!"

    }

}