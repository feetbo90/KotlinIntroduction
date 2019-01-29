/*
    inisialisasi awal

    kondisi

    increment / decrement

    mhdiqbalpradipta@gmail.com
    TUGAS 1 kotlin

 */

fun main(args: Array<String>) {

    println("CARA PERTAMA : ")
    for (i in 1..10)
    {
        println(i)
    }

    println("CARA KEDUA : ")
    for (i in 1 .. 10 step 2)
    {
        println(i)
    }

    println("CARA KETIGA : ")
    for (i in 1 until 10 step 2)
    {
        println(i)
    }

    println("CARA KEEMPAT : ")
    for (i in 10 downTo 1)
    {
        println(i)
    }

    println("CARA KELIMA : ")
    for (i in 10 downTo 1 step 2){
        println(i)
    }

}