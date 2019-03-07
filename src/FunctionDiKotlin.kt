import java.util.Scanner

/*

    function pengembalian nilai dan tanpa pengembalian nilai

    1 . pengembalian nilai

    deklarasi

    fun nama_function (parameter...): tipe_data{

        return nilai
    }


 */
// fungsi dengan pengembalian nilai
fun jumlah(bilangan : Int, bilangan2:Int): Int{

    var hasil = bilangan + bilangan2
    return hasil
}

// function expression
fun jumlah2(bilangan: Int, bilangan2: Int) = bilangan + bilangan2

fun konversiNilai(bilangan : Double) =
    if (bilangan >= 90){
         "A"
    }else if (bilangan > 80 && bilangan< 90){
        "B+"
    }else{
        "C"
    }



// fungsi tanpa pengembalian nilai
fun fungsiTanpaJumlah (bilangan: Int, bilangan2: Int):Unit{
    var hasil = bilangan + bilangan2

    println("fungsi tanpa pengembalian nilai")
    println("Jumlah : $hasil")
}

// function named parameters
fun namedParams(bilangan:Int = 2, bilangan2: Int) {

    var hasil = bilangan + bilangan2

    println("fungsi tanpa pengembalian nilai named parameters")
    println("Jumlah : $hasil")
}

// extension function
fun Int.kurang(bilangan2: Int):Int = this - bilangan2

// infix function
infix fun Int.dikurang(bilangan2:Int):Int{
    return this - bilangan2
}




fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    println("Masukkan bilangan pertama : ")
    var bilangan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    var bilangan2 = input.nextInt()

    // fungsi yang pertama
    println(jumlah(bilangan,bilangan2))

    println(jumlah2(bilangan,bilangan2))

    fungsiTanpaJumlah(bilangan, bilangan2)

    namedParams(bilangan2 = bilangan2, bilangan = bilangan)

    // cara pemanggilan extension function
    println(bilangan.kurang(bilangan2))

    var kurang = bilangan dikurang bilangan2
    println(kurang)


    println(konversiNilai(70.0))
}