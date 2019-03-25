
class Segitiga {

    private var alas : Double = 0.0
    private var tinggi : Double = 0.0
    private var luas : Double = 0.0

    fun hitungLuas(alas : Double , tinggi : Double) : Double
    {
        this.tinggi = tinggi
        this.alas = alas
        this.luas = ( alas * tinggi ) / 2
        return this.luas
    }
}

fun main(args: Array<String>) {

    val segitiga = Segitiga()
    println( "maka luas segitiga ${segitiga.hitungLuas(4.0, 5.0)} ")

}