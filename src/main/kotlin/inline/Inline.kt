package berlin.kotlin.inline

import kotlin.random.Random

fun main() {
    testNormal()
    testInline()
}

private fun testNormal() {
    println("Normal:")
    useRandomNormal {
        println("Random value is $it")
        if (it < 0) {
            println("Exiting")
            // non-local return not possible
            // return
            return@useRandomNormal
        }
    }
    println("Done")
}

private fun testInline() {
    println("Inline:")
    useRandomInline {
        println("Random value is $it")
        if (it < 0) {
            println("Exiting")
            return
        }
    }
    println("Done")
}

private fun useRandomNormal(action: (Int) -> Unit) {
    action(Random.nextInt())
}

private inline fun useRandomInline(action: (Int) -> Unit) {
    action(Random.nextInt())
}
