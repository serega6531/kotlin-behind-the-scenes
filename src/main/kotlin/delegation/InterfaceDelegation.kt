package berlin.kotlin.delegation

fun main() {
    val base = BaseImpl(10)
    val derived = Derived(base)
    derived.print()
    derived.doSomethingElse()
}

interface Base {
    fun print()
}

class BaseImpl(private val x: Int) : Base {
    override fun print() { println(x) }
}

class DerivedNaive(private val b: Base) : Base {
    override fun print() {
        b.print()
    }

    fun doSomethingElse() = println("abc")
}

class Derived(b: Base) : Base by b {
    fun doSomethingElse() = println("abc")
}