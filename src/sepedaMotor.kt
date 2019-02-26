
// primary constructor
class sepedaMotor(merk : String, roda: Int, warna : String){

    constructor(merk: String, roda: Int, warna: String, harga: Int): this(merk, roda, warna){
        println("ini constructor kedua (secondary)")
        this.harga = harga
    }

    // properti atribut
    var warna: String =""
    var roda: Int = 0
    var merk : String = ""
    var harga: Int =0

    init {
        println("pada saat objek dibuat")
        this.warna = warna
        this.roda = roda
        this.merk = merk
    }

    // properti fungsi

    fun sepedaMotorBergerak(){
        println("Sepeda Motor bergerak")
    }

    fun sepedaMotorBerhenti(){
        println("Sepeda Motor berhenti")
    }


}
