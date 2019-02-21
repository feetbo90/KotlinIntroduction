import java.util.*

fun main(args: Array<String>) {

    for(i in 1 .. 10)
    {
        println(i)
    }

    println("===================================")

    for(i in 1 until 10)
    {
        println(i)
    }

    println("===================================")

    for (i in 1 .. 10 step 2)
    {
        println(i)
    }

    println("===================================")

    for (i in 10 downTo 1)
    {
        println(i)
    }

    println("===================================")

    for(i in 10 downTo 1 step 2)
    {
        println(i)
    }

    var input = Scanner(System.`in`)
    println("Masukkan bilangan : ")
    var bilangan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    var bilangan2 = input.nextInt()

    for (i in bilangan .. bilangan2){
        if (i % 2 == 1)
        {
            println(i)
        }
    }

}