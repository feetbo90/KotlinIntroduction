
import java.util.Scanner

fun main(args: Array<String>) {

    var input = Scanner(System.`in`)

    // cara I
    var list = mutableListOf<Int>()

    // cara II
    var list2 = mutableListOf<Int>( 2,3,4,5)
    list2.add(10)

   for (i in 0 until list2.size)
   {
       println("ini list : ${list2.get(i)}")
   }

    list2.removeAt(2)

    for (i in 0 until 5)
    {
        list.add(input.nextInt())
    }

    for (i in 0 until list.size)
    {
        println("ini list : ${list.get(i)}")
    }



    }