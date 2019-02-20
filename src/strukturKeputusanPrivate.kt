
/*
    AND &&
    1   1   1
    1   0   0
    0   1   0
    0   0   0

    OR ||
    1   1   1
    1   0   1
    0   1   1
    0   0   0

    logika perbandingan
    >, < , >= , <= , == !=




 */


fun main(args: Array<String>) {

    if(9 > 8 && (8 < 2 || 7 > 3)){
        println("ini benar")
    }
    else{
        println("ini salah")
    }

    var bilangan: Int = 90

     /*
        > 90    A
        80 s/d 90   B+
        70 s/d 80 B
      */
    if(bilangan > 90)
    {
        println("A")
    }else if (bilangan > 80 && bilangan <= 90)
    {
        println("B+")
    }else if (bilangan > 70 && bilangan <= 80)
    {
        println("B")
    }
    var bilangan2 = 800
    if(bilangan > bilangan2)
    {
        println(bilangan)
    }else {
        println(bilangan2)
    }
}