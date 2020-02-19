fun main(args:Array<String>)
{
        println("Person name is ${Personal.personName} and contact is ${Personal.personContact}")
      //  println("info is "+namePerson)
}
class Personal
{
    companion object{
        @JvmField
        var personName ="Bhagya"
        @JvmField
        var personContact:Int=27277272
    }
}