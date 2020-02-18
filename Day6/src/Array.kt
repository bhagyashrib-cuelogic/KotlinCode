fun main(args:Array<String>)
{
  //  array()
    arrayGetSet()
}
fun array()
{
    var Array1= arrayOf("bhagya",1,2,3,"Swapnil")
    for(i in Array1) {
        print("$i\t")
    }
    println()
  //  var Array2=arrayOf<Int>(1,2,3,"bhagya")//type mistmatch found required int and found string
    var Array2=arrayOf<Char>('a','b','c','d','e')
    for(e in Array2) {
        print("$e\t")
    }
    println()
    var Arrayint= intArrayOf(1,3,4)
    for(i in Arrayint)
        print("$i\t")
    println()

    var Arraychar= charArrayOf('a','h','e')
    for(i in Arraychar)
        print("$i\t")
}
fun arrayGetSet()
{
    var Arrayset= arrayOf('a','b',1,3,"Bhagya")
    Arrayset.set(3,3333)
    for(i in Arrayset)
         print("$i\t")
    println()
   println( Arrayset.get(2))
    Arrayset[2]=0
    for(i in Arrayset)
        print("$i\t")
}