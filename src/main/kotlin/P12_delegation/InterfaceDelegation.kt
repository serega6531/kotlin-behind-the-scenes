package berlin.kotlin.delegation

fun main() {
    val base = BaseImpl("base")
    val derived = DerivedNaive(base)
    derived.print()
    derived.printSomethingElse()
}

interface Base {

    fun print()
}

class BaseImpl(private val x: String) : Base {

    override fun print() { println(x) }

}

class DerivedNaive(private val b: Base) : Base {

    override fun print() {
        b.print()
    }

    fun printSomethingElse() = println("somethingElse")
}

class Derived(b: Base) : Base by b {

    fun printSomethingElse() = println("somethingElse")

}