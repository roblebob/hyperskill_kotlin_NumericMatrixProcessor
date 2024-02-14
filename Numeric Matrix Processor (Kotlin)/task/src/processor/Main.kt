package processor

fun main() {
    val A_dim = readln().split(" ").map { it.toInt() }


}



class Matrix<T : Number>(val row: Int, val col: Int) {
    val matrix: MutableList<MutableList<T>>

    init {
        matrix = MutableList(row) { MutableList(col) { 0 as T } }
    }

    override fun toString(): String = matrix.joinToString("\n") { it.joinToString(" ") }
}




inline fun <reified T : Number> processNumber(number: T) {
    when (number) {
        is Byte, is Short, is Int, is Long, is Float, is Double -> {
            // Process the number
            println("Processing number: $number")
        }
        else -> throw IllegalArgumentException("Unsupported type: ${T::class}")
    }
}