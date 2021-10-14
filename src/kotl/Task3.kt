package kotl

fun main() {
    val matrix = Matrix()

    matrix.matrixAddition()
    matrix.multiplicationByNumber()
    matrix.printout()
    matrix.matrixMultiplication()
}

class Matrix{

    fun matrixAddition() {
        val rows = 3
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3), intArrayOf(8, 6, 4))
        val secondMatrix = arrayOf(intArrayOf(7, 5, 3), intArrayOf(5, 6, 3), intArrayOf(3, 7, 5))

        val sum: Array<Array<Double>> = Array(rows) { Array(columns, { 0.0 }) }
        for (i in 0..rows - 1) {
            for (j in 0..columns - 1) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j].toDouble()
            }
        }

        println("Sum of two matrices is: ")
        for (row in sum) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }

    fun multiplicationByNumber() {
        val rows = 3
        val columns = 3
        val k = 5

        var num= Array(rows) {DoubleArray(columns, {0.0})}
        num = arrayOf(doubleArrayOf(2.0, 3.0, 4.0), doubleArrayOf(5.0, 2.0, 3.0), doubleArrayOf(8.0, 6.0, 4.0))
        for (i in 0..rows - 1) {
            for (j in 0..columns - 1) {
                num[i][j] = num[i][j] * k
            }
        }

        println("Multiplication by a number: ")
        for (row in num) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }

    fun printout() {
            val rows = 3
            val columns = 3

            var mat= Array(rows) {DoubleArray(columns, {0.0})}
             mat = arrayOf(doubleArrayOf(2.0, 3.0, 4.0), doubleArrayOf(5.0, 2.0, 3.0), doubleArrayOf(8.0, 6.0, 4.0))
                println("Printout: ")
                for (row in mat) {
                    for (column in row) {
                        print("$column    ")
                    }
                    println()
                }
            }

    fun matrixMultiplication(){
        val rows = 3
        val columns = 3
        val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3), intArrayOf(8, 6, 4))
        val secondMatrix = arrayOf(intArrayOf(7, 5, 3), intArrayOf(5, 6, 3), intArrayOf(3, 7, 5))

        val mult: Array<Array<Double>> = Array(rows) { Array(columns, { 0.0 }) }
        for (i in 0..rows - 1) {
            for (j in 0..columns - 1) {
                mult[i][j] = firstMatrix[i][j] * secondMatrix[i][j].toDouble()
            }
        }

        println("Matrix multiplication: ")
        for (row in mult) {
            for (column in row) {
                print("$column    ")
            }
            println()
        }
    }
    }





