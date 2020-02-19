@file:JvmName("kotlinClass")
class Addfun {
}
fun main()
{
    var sum = Add()
    val addObj=sum.add(1,2)
    println("Addition is "+addObj)
    println("Subtractio is "+Sub(10,2))
    var mul = Add()
     println("Multiplication is "+ mul.mult(1,3))

}
fun Sub(a:Int,b:Int) : Int
{
     return a-b
  //  println("Subtraction is "+sub)
}
//fun Multiplication()
////{
////    val result:Int = Add.main()
////}