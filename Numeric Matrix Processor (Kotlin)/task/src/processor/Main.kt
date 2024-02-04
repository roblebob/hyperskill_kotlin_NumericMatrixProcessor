package processor

fun main() {
    val A_dim = readln().split(" ").map { it.toInt() }
    val A = MutableList(A_dim[0]) { readln().split(" ").map { it.toDouble() } }
}
