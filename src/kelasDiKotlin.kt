
class Mobil {

    // attribut variable
    var warna : String = ""
    var roda : Int = 0
    var merk : String = ""


    // attribut function

    fun mobilBergerak() {
        println( " Mobil dapat bergerak ")
    }

    fun mobilBerhenti() {
        println(" Mobil berhenti ")
    }

}

fun main(args: Array<String>) {

    // create object
    val bMW = Mobil()
    bMW.mobilBergerak()
    bMW.mobilBerhenti()
    bMW.warna = "Hitam"
    bMW.roda = 4
    bMW.merk = "bmw ..."

    println(" warna : ${bMW.warna} dan roda : ${bMW.roda} dan merk : ${bMW.merk}")
}