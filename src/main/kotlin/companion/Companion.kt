package berlin.kotlin.companion

fun main() {
    println(Outer.second())
}

class Outer {

    companion object {

        fun second() = "hello"

    }

}