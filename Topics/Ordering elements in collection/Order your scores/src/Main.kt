fun main() {
    val list = readln().split(" ").map { it.toInt() }
    // write your code here
    val res = list.sortedDescending()
    println(res)
}