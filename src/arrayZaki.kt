
class ArrayContoh {

    fun inputArray(size : Int) : IntArray {

        val array = IntArray(size)
        array[0] = 20
        for (i in 0 until array.size) {
            println(" Masukkan nilai di indeks $i : ")
            array[i] = readLine()!!.toInt()
        }
        return array
    }

    fun tampilArray(array: IntArray) {
        for (i in 0 until array.size) {
            println( " ini indeks ke $i : ${array[i]}")
        }
    }

    fun faktorial(faktor : Int) : Int {
        val faktorial = 1

        return faktorial
    }
}

fun main(args: Array<String>) {

    println(" Masukkan size untuk array : ")
    val input = readLine()!!.toInt()
    val example = ArrayContoh()
    val array = example.inputArray(input)

    example.tampilArray(array)

    example.faktorial(3)

}