fun ratarata (list: MutableList<Int>):Double{
    var rata = 0
    // fungsi untuk rata"
    for( i in 0 until list.size){
        rata = rata + list.get(i)
    }

    return rata.toDouble() / list.size
}

fun tampil(list: MutableList<Int>):Unit{

    for (i in 0 until list.size){
        println(list.get(i))
    }
}