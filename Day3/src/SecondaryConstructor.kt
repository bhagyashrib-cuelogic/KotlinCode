//Super Constractor

fun main(args:Array<String>)
{
        val teacherObj=teacher("Meena","Maths")
        println()
        val studObje=classStudent("bhagya",1,"Meena","Maths")
}
open class teacher
{
    constructor(nameTeacher:String,teachersub:String)
    {
        println("teacher Name is "+nameTeacher +"\n"+" Teacher subject "+teachersub)
    }
}
class classStudent:teacher
{
    constructor(studName:String,id:Int,nameTeacher: String,teachersub: String):super(nameTeacher,teachersub)
    {
        println("Student name is "+studName + "\n"+"Student id is"+id)
    }
}