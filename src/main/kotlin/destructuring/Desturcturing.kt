package berlin.kotlin.destructuring

fun main() {
    val test = MyClass()

    val (first, second) = test
    println(first)

    val (_, _, third) = test
    println(third)
}

class MyClass {
    operator fun component1() = "abc"
    operator fun component2() = 123
}

operator fun MyClass.component3() = true