
/*

    var / val nama_variabel : type_data = nilai

    var bilangan : Int = 10

    Float, Double, boolean,

    operator aritmatika
    + , - , /, *, %
 */

import java.util.Scanner


fun main(args: Array<String>) {

    var bilangan : Int = 10
    var bilanganInputan : Int?
    var bilangan2 : Int?
    var hasil : Int?

    var input = Scanner(System.`in`)
    println("Masukkan bilangan : ")
    bilanganInputan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    bilangan2 = input.nextInt()

    hasil = bilanganInputan + bilangan2

    println(" Maka hasil penjumlahannya adalah : $hasil")


}