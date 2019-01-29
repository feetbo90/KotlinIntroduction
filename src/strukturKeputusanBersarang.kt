
/*
     > 90 = A
     80 s/d 90 = B+
     70 s/d 79 = B

    if(){

    }
    else if(){

    }
    else if(){

    }
 */
import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    var bilangan : Int?
    bilangan = input.nextInt()

    // 3 buah bilangan
    // 100, 90, 90
    // 280 / 3 = 93.3 Double / Float
    // rata-rata = 100


    if (bilangan > 90 )
        println("A")
    else if (bilangan >= 80 && bilangan <= 90)
        println("B+")
    else if (bilangan>= 70 && bilangan < 80)
        println("B")
    else {
        println("C")
    }
}