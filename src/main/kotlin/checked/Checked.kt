package berlin.kotlin.checked

import java.io.IOException

fun main() {
    second()
    third()
}

fun second() {
    throw IOException("Test")
}

@Throws(IOException::class)
fun third() {
    throw IOException("Test")
}