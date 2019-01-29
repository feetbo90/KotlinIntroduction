

/*
    logika boolean and dan or

    and &&

    T   T   T
    T   F   F
    F   T   F
    F   F   F

    or ||
    F   F   F
        T

 */

import java.util.Scanner

fun main(args: Array<String>) {

    var bilangan : Int?
    var bilangan2 : Int?

    var input = Scanner(System.`in`)
    println("Masukkan bilangan pertama : ")
    bilangan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    bilangan2 = input.nextInt()

    if (bilangan > bilangan2)
    {
        println("Maka $bilangan yang terbesar ")
    }else{
        println("Maka $bilangan2 yang terbesar ")
    }

    if (bilangan %2 == 0)
    {
        println("Maka $bilangan adalah Genap")
    }else
        println("Maka $bilangan adalah Ganjil")



}