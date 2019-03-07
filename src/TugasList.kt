import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    var bilangan = input.nextInt()

    var list = mutableListOf<Int>()

    for (i in 0 until bilangan){

        println("input indeks $i")
        list.add(input.nextInt())
    }

    // nampilkan yang ganjil
    println("Maka bilangan ganjil dari list adalah : ")

    for (i in 0 until bilangan){

        if(list.get(i) % 2 == 1)
        {
            println(list.get(i))
        }
    }

}