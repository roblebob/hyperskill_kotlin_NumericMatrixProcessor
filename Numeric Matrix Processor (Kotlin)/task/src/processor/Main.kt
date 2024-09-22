package processor

import kotlin.system.exitProcess

const val ERROR = "ERROR"

fun main() {
    val A_dim = readln().split(" ").map { it.toInt() }
    val A = Matrix(A_dim[0], A_dim[1])

//    val B_dim = readln().split(" ").map { it.toInt() }
//    A.add(Matrix(B_dim[0], B_dim[1]))

    val c = readln().toInt();
    A.mult(c)

    println(A)
}



class Matrix(val row: Int, val col: Int) {
    private val matrix: MutableList<MutableList<Int>> = MutableList(row) { MutableList(col) { 0 } }

    init {
        require(row > 0 && col > 0) { ERROR }

        repeat(row) {
            i -> matrix[i] = readln().split(" ").map { it.toInt() }.toMutableList()
                .also { require(it.size == col) { ERROR } }
        }
    }

    fun add(other: Matrix) {
        if(row != other.row || col != other.col) {
            println(ERROR)
            exitProcess(0)
        }

        repeat(row) { i ->
            repeat(col) { j ->
                matrix[i][j] += other.matrix[i][j]
            }
        }
    }

    fun mult(c: Int) {
        repeat(row) { i ->
            repeat(col) { j ->
                matrix[i][j] *= c
            }
        }
    }


    override fun toString(): String = matrix.joinToString("\n") { it.joinToString(" ") }
}




