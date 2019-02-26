import java.util.Scanner



fun main(args: Array<String>) {

    var input = Scanner(System.`in`)
    input.nextInt()
    // cara deklarasi objekc dengan constructor default
    var vixion = sepedaMotor("Yamaha 2", 2, "Hitam Putih")

    println("${vixion.merk} dengan warna ${vixion.warna} dan roda ${vixion.roda}")


    vixion.merk = "Yamaha"
    vixion.roda = 2
    vixion.warna = "Hitam"

    println("${vixion.merk} dengan warna ${vixion.warna} dan roda ${vixion.roda}")

    vixion.sepedaMotorBergerak()
    vixion.sepedaMotorBerhenti()


    var Honda = sepedaMotor("Honda", 2, "Merah", 1400000)
    println("${Honda.merk} dengan warna ${Honda.warna} dan roda ${Honda.roda} dengan harga ${Honda.harga}")

}