package berlin.kotlin.singletons

fun main() {
    val test = object {
        override fun toString() = "Test"
    }

    println(test)
}

