fun main(args:Array<String>)
{
      var pul=Public()
      pul.display("bhagya",22)
      var driv=driver()
      driv.display("swapnil",33)
      val c= car()
      c.display()
  // println(driv.age)// accesible only for that class not to all
}
internal val carNumber:Int?=2333 //accessible to only for that module can use anywhere in that module or program
//Public is bydefault
class Public
{
    fun display(Name:String,id:Int)
    {
        println("name is "+Name+" and id is "+id)
        println("car number is "+carNumber)
    }
}

 open class driver
{
   // private var age:Int=23
    protected var carName:String="Inova"  // can be use in only inherited classes not in another clasess
    fun display(Name: String,id:Int)
    {
        println("name is "+Name+"and id is"+id)
    }
}

class car:driver(){
     fun display()
     {
         println("car name is "+carName)
     }
}