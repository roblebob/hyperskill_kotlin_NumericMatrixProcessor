package processor

fun main() {
    val A_dim = readln().split(" ").map { it.toInt() }
    val A = MutableList(A_dim[0]) { mutableListOf(
            readln().split(" ").map { it.toInt() }
    )
    }
    printMatrix(A)
}



class Matrix {

    val field = mutableListOf<MutableList<Int>>()

    init {
        val A_dim = readln().split(" ").map { it.toInt() }
        val A = MutableList(A_dim[0]) { mutableListOf(
                readln().split(" ").map { it.toInt() }
        )
        }
        printMatrix(A)
    }







}



fun printMatrix(A: MutableList<MutableList<Int>>) {
    for (i in A) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
}
