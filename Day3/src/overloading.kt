//runtime polymorphism
//decide rum time which mwthod can be use

fun main(args:Array<String>)
{
      var obj=Maths()
       obj.add(1,2)
       var cal=calculation()
       cal.add(4,5)

}

open class calculation
{

   open fun add(num1:Int,num2:Int)
    {
        var add=num1+num2
        println("Addition is "+add)
    }
}
class Maths: calculation()
{
    override fun add(num1:Int, num2:Int)
    {
        var add=num1+num2
        println("overriding fun is "+add)
    }
}
