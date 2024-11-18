package berlin.kotlin.dataclass

fun main() {
    val test = MyClass("abc", 123)
    println(test.str)

    val (str, num) = test
    println(str)
}

data class MyClass(
    val str: String,
    val num: Int
)