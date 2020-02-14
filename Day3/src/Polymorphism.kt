//Function Polymorphism
fun main(args:Array<String>)
{
    var poly=polymorphism()
    poly.add(1,2)
    poly.add(3.4f,4,59.00)
    println()

    var per=person()
    per.person("Bhagya",3333333,"katraj")
    per.person("swapnil",444444444,"pune",5666)


}
class polymorphism
{
    //function overloading
    //Same name of function but different parameter
    //decide at compile time which function can be run according to number of paramter or datatypes
    fun add(num1:Int,num2:Int)
    {
        var addTwo=num1+num2
        println("addTwo numbers "+addTwo)
    }
    fun add(num1:Float,num2:Int,num3:Double)
    {
        var addThree=num1+num2+num3
        println("add three numbers "+addThree)
    }
}
class person() {
    fun person(personName: String, contactNumber: Int, add: String)
    {
            println("Person one is  "+personName + " "+contactNumber+ " "+add)
    }
    fun person(personName: String, contactNumber: Int, add: String,contactNumber2: Int)
    {
        println("Person second is  "+personName + " "+contactNumber+ " "+add+" "+contactNumber2)
    }
}