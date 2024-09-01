import java.util.*

fun main(args: Array<String>){
    val a = readLine()?.toIntOrNull()

    val b = readLine()?.toIntOrNull()

    if(a != null && b != null){
        val x = a + b
        println("X = $x")
    }
}

