package berlin.kotlin.variance

fun main() {
    testList()
    testMutableList()
    // TODO interop
}

private fun testList() {
    val list: List<String> = listOf("abc", "def")
    prettyPrint(list)

    val list2: List<Any> = list
    prettyPrint(list2)
}

private fun testMutableList() {
    val list: MutableList<String> = mutableListOf("abc", "def")
    prettyPrint(list)

    // val list2: MutableList<Any> = list
}

private fun prettyPrint(list: List<Any>) {
    println(list.joinToString(separator = ", "))
}