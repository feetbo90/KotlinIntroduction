
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
    var bilanganInputan : Double?
    var bilangan2 : Int?
    var hasil : Int?

    var input = Scanner(System.`in`)
    println("Masukkan bilangan : ")
    bilanganInputan = input.nextDouble()

    var fahrenheit = (bilanganInputan * 9 / 5) + 32
    println(fahrenheit)
//    45°C × 9/5) + 32 = 113°F


}