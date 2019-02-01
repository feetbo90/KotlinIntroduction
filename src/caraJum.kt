
import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    println("Masukkan nilai awal")
    var nilaiAwal = input.nextInt()
    println("Masukkan nilai akhir")
    var nilaiAkhir = input.nextInt()

    var jumlah : Int = 0

    for (i in nilaiAwal .. nilaiAkhir)
    {
        jumlah = jumlah + i
    }
    println("maka jumlah keseluruhan : $jumlah")
}

/*

SOAL I
    4 * 5

    4 + 4 + 4 + 4 + 4 = 20

    4! = 4 * 3 * 2 * 1

    3! = 3 * 2 * 1

    2! = 1 * 2

SOAL II

    v = 20 km/jam
    jarak = 200

    t = jarak / v  = 10

    20 + 20 + ... dst = 200
    10
 */