package berlin.kotlin.nullsafety

fun main() {
    val a = getNullable()?.get(0)?.length
    println(a)
}

private fun getNullable(): List<String>? = null