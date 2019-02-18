
fun nilaiRata(mutableList: MutableList<Int>): Double{
    var jumlah : Int = 0
    for (i in 0 until mutableList.size){
        jumlah = jumlah + mutableList.get(i)
    }

    return jumlah.toDouble() / mutableList.size.toDouble()
}

fun main(args: Array<String>) {
    var list2 = mutableListOf<Int>( 100,90)
    var rata = nilaiRata(list2)
    println(rata)
}