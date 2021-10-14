package kotl


import java.util.stream.IntStream.range

fun main() {

    recursive()

    }

    fun recursive(a:Int = 12, b:Int=25) {

        if (a > b) {
             val a1 = a
            val a = a -1
            println(a1)
            recursive(a)
        } else {
            for (i in a..b) {
                println(i)
            }
        }
    }

