/*

    sekumpulan nilai yang sama

    array 5

    0 s/d 4


    23  44  55  89  10
    0   1   2   3   4

    array[3]
    89

 */
import java.util.Scanner

fun main(args: Array<String>) {


    var nilai = intArrayOf(4, 3, 20, 10)
    var doubleNilai = doubleArrayOf(12.4, 4.5, 22.4, 32.1)

    println(nilai[2])

    for(i in 0 until nilai.size)
    {
        println("ini dari pengulangan : ${nilai[i]}")
    }

    for(i in (nilai.size-1) downTo 0){
        println("ini dari pengulangan kedua : ${nilai[i]}")
    }

    // var namaArray = Nama_Inisialisasi(jumlah)
    var arrayTiga2 = IntArray(5)

    var input = Scanner(System.`in`)
    var inputan = input.nextInt()
    var arrayTiga = IntArray(inputan)


    //arrayTiga[4] = input.nextInt()

    for(i in 0 until arrayTiga.size)
    {
        arrayTiga[i] = input.nextInt()
    }

    for(i in 0 until arrayTiga.size)
    {
        println("ini dari pengulangan : ${arrayTiga[i]}")
    }

//    println("Hasil Input : ${arrayTiga[4]}")

}

/*
    0   1   2   3   4
                    45


 */