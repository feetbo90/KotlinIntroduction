


/*


 */

fun printHello(): Unit{

    println("Hello function")
}

// tipe data pengembalian

fun penjumlahan(bilangan : Int, bilangan2: Int): Int{
    return bilangan + bilangan2
}

fun printHelloWorld(str1 : String, str2: String) : String{

    return "$str1 $str2"
}

// fungsi named parameter
fun perkalian(bilangan: Int = 3, bilangan2: Int = 12): Int{

    return bilangan * bilangan2
}

// fungsi extension
fun Int.dikurang(bilangan2: Int, bilangan3 : Int): Int{

    return this - bilangan2
}

// infix function
infix fun Int.dibagi(bilangan2: Int):Float{
    return this.toFloat() / bilangan2.toFloat()
}

// expression function

fun hasilRataRata(bilangan: Int): String =
    if (bilangan > 90){
        "A"
    }else{
        "B"
    }

// fungsi biasa
fun hasilRataRata2(bilangan: Int):String{

    if(bilangan>90){
        return "A"
    }else{
        return "B"
    }
}

// fungsi expression
fun double(x: Int, y: Int) = x * y

fun dikali2(x: Int, y : Int):Int {
    return x * y
}


fun printList(list: MutableList<Int>){
    for (i in 0 until list.size){
        println(list.get(i))
    }
}

fun main(args: Array<String>) {

    // tipe data unit / void
    printHello()

    // tipe data pengembalian return
    var helloWorld = printHelloWorld("Hello", "World")
    println(helloWorld)

    println(perkalian(2,bilangan2 = 2))

    //pengurangan(11, 12)
    // extension function
    println(11.dikurang(12, 13))

    // infix function
    var hasil = 11 dibagi 2
    println(hasil)

    // expression function
    println(hasilRataRata(91))


    // code untuk menampilkan data list
    var list2 = mutableListOf<Int>( 2,3,4,5,11,10,12,222,333,3344,444)
    printList(list2)

    var test : Long = 19
    println(test)
}


// 3  :  12 10 3
// function .. terserah mau apa aja
/*
    tugas 2 : 4
    100 90  90  100
    kirim ke fungsi utk list : nilai rata" dia  92.5 ( Double )

    92.5 kita kirim ke fungsi hasil A , B , C, D, E

 */
