import java.util.Scanner
fun main(args: Array<String>) {

    println("Masukkan jumlah list : ")
    var input = Scanner(System.`in`)
    var jumlah = input.nextInt()

    // cara untuk deklarasi list
    var list = mutableListOf<Int>()

    // pengulangan jumlah yang kita input

    for (i in 0 until jumlah){
        println("Masukkan nilai dari indeks : $i")
        var nilai = input.nextInt()
        list.add(nilai)
    }

    // fungsi untuk menampilkan

    for (i in 0 until jumlah){
        println(list.get(i))
    }

    var rata = 0
    // fungsi untuk rata"
    for( i in 0 until list.size){
        rata = rata + list.get(i)
    }
    println("nilai rata rata : ${rata.toDouble() / list.size}")


    println("ini pemanggilan dari fungsi : ")
    tampil(list)
    println("ini nilai rata dari fungsi")
    println(ratarata(list))


}

