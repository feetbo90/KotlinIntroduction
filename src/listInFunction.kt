


fun main(args: Array<String>) {

    println("Masukkan size dari list ")
    var input = readLine()!!.toInt()

    val list = mutableListOf<Int>()
    for ( i in 0 until input)
    {
        println("Masukkan nilai di index $i : ")
        input = readLine()!!.toInt()
        list.add(input)
    }

    for ( i in 0 until list.size ) {
        println( " indeks ke $i : ${list[i]} " )
    }

    println(" ini dari fungsi ")
    val listNew = inputList()
    printList(listNew)
}



/*

    list size = 4

    0   1   2   3


 */