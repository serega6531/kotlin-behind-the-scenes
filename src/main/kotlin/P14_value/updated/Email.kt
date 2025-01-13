package berlin.kotlin.value.updated

@JvmInline
value class Email(
    val value: String
) {
    init {
        require(value matches Regex(".+@.+")) { "$value is not a valid email" }
    }

    val hostname: String
        get() = value.split("@").last()
}