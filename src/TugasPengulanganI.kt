import java.util.Scanner

fun main(args: Array<String>) {

    println("Masukkan bilangan 1 : ")
    var input = Scanner(System.`in`)
    var bilangan = input.nextInt()
    println("Masukkan bilangan 2 : ")
    var bilangan2 = input.nextInt()

    var kali = 0
    for (i in 1 .. bilangan2)
    {
        kali = kali + bilangan
    }

    print(kali)

}

