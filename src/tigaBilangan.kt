
import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    println("Masukkan bilangan pertama : ")
    var bilangan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    var bilanganKedua = input.nextInt()
    println("Masukkan bilangan ketiga : ")
    var bilanganKetiga = input.nextInt()

    if (bilangan > bilanganKedua && bilangan > bilanganKetiga)
    {
        println("$bilangan")
    }
    if (bilanganKedua > bilangan && bilanganKedua > bilanganKetiga)
    {
        println("$bilanganKedua")
    }
    if(bilanganKetiga > bilangan && bilanganKetiga > bilanganKedua)
        println("$bilanganKetiga")

    println("------------------------------------------------------")

    if(bilangan > bilanganKedua){
        if(bilangan > bilanganKetiga)
        {
            println("$bilangan")
        }else{
            println("$bilanganKetiga")
        }
    }else{
        if(bilanganKedua > bilanganKetiga)
        {
            println("$bilanganKedua")
        }
        else
            println("$bilanganKetiga")
    }


}