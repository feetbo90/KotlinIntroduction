import java.util.Scanner


fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    var bilangan = input.nextInt()

    var faktorial = 1
    for (i in bilangan downTo 1)
    {
        faktorial = faktorial * i
    }

    println(faktorial)
}