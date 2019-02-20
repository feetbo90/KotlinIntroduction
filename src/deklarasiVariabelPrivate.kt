/*

    Int
    Double
    Float
    String
    boolean

    var / val nama_variabel : tipe data = value

    var bilangan : Int = 12



 */
import java.util.Scanner


fun main(args: Array<String>) {
// hallo
    var bilangan : Int = 12

    println("Hallo kotlin $bilangan")
    print("Hallo kotlin "+ bilangan)

    var input = Scanner(System.`in`)
    var bilangan2 : Int
    bilangan2 = input.nextInt()
    println(bilangan2)
}