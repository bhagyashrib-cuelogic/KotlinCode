import java.util.Scanner
fun main(args:Array<String>) {
    var studObj = Stud()

    val sc = Scanner(System.`in`)
    println("How many student do ypu want?")
    var studNum=sc.nextInt()
    for(item in 1..studNum)
    {
        studObj.getName()
        studObj.setName()
        studObj.display()
        println()
    }
}

open class Teacherr
{
    val teacherName="Sunita"
    val standard=2
    var rollNumber=1
    var studName:String?=null

    fun rollNumber()
    {
        println("RollNumber is "+rollNumber)
        rollNumber++
    }

    fun teacher()
    {
        println("Teacher Name is $teacherName")
        println("Standrad is "+standard +"nd")
    }
}

class Stud:Teacherr()
{
    fun getName()
    {
        println("Enter student name")
        studName= readLine()
    }
    fun setName()
    {
        println("Student name is "+studName)
    }
    fun display()
    {
        rollNumber()
        teacher()
    }
}