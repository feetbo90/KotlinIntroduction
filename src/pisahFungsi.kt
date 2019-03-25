fun inputList() : List<Int> {
    val list = mutableListOf<Int>()
    println("Masukkan size dari list ")
    var masuk = readLine()!!.toInt()
    for (i in 0 until masuk) {
        println("Masukkan nilai di index $i : ")
        masuk = readLine()!!.toInt()
        list.add(masuk)
    }
    return list
}

fun printList(list : List<Int>){
    for ( i in 0 until list.size ) {
        println( " indeks ke $i : ${list[i]} " )
    }
}
