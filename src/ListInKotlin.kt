fun main(args: Array<String>) {

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

    for (i in 0 until list2.size)
    {
        println("ini list : ${list2.get(i)}")
    }



}