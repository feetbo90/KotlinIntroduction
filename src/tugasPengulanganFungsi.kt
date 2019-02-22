
import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    var bilangan = input.nextInt()
    tampilSegitiga(bilangan)
    println(tampilSegitigaDua(bilangan))
}

fun tampilSegitiga(bilangan : Int){
    for (i in 1..bilangan) {
        println()
        for (a in 0 until (i)) run {
            print("* ")
        }
    }

}

fun tampilSegitigaDua(bilangan:Int): String{
    var kalimat : String = ""
    for (i in 1..bilangan) {
        kalimat = kalimat + "\n"
        for (a in 0 until (i)) {
            kalimat = kalimat + "* "
        }

    }

    return kalimat
}
