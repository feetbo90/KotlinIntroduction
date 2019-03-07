/*

     cara deklarasi list
     1 . var nama_list = mutablelistOf<TipeData>()
     2 . var nama_list = mutablelistOf<TipeData>(2,3,4,5)



 */
import java.util.Scanner

fun main(args: Array<String>) {

    // cara I
    var bilangan = mutableListOf<Int>()

    bilangan.add(10)

    println("ini list indeks ke 0 = ${bilangan.get(0)}")

    var input = Scanner(System.`in`)

    println("Masukkan size list : ")
    var sizeList = input.nextInt()
    var inputDinamis = mutableListOf<Int>()

    for (i in 0 until  sizeList){
        println("Masukkan indeks $i :")
        inputDinamis.add(input.nextInt())
    }

    println("ini data dari inputan")
    for (i in 0 until sizeList)
    {
        println(inputDinamis.get(i))
    }

    // cara II
    var list = mutableListOf<Int>(2,3,4,5)
    list.add(90)
    println("ini data dari statis")
    for (i in 0 until list.size)
    {
        println(list.get(i))
    }
}