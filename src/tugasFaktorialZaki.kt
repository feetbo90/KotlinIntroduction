import java.util.*

fun faktor(bilangan : Int):Int{

    var faktor = 1
    for (i in 1 .. bilangan )
    {

        faktor = faktor * i
    }
    return faktor
}

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    println("Masukkan nilai : ")
    var nilai = input.nextInt()
    println(faktor(nilai))
}