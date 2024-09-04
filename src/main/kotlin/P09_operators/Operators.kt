package berlin.kotlin.operators

fun main() {
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)

    println(v1 + v2)
    println(v1.plus(v2))

    println(-v1)
    println(v1.unaryMinus())
}

data class Vector(val x: Int, val y: Int) {

    operator fun plus(v: Vector) = Vector(x + v.x, y + v.y)

    operator fun unaryMinus() = Vector(-x, -y)

}