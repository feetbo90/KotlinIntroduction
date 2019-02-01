import java.util.Scanner

fun main(args: Array<String>) {

    var kecepatan = 20
    var jarak = 200
    var waktu : Int
    var jum = 0
    for (i in 0 until jarak step kecepatan){
        jum = jum + 1
        waktu = jarak / kecepatan
    }
    println(jum)

}