//Constrctor
//Use to intialize the paramters
//Primary Constrctor
fun main(args:Array<String>)
{
    //primary constrctor
    var studObj=Student("Bhagya",22)
    println("student name is "+studObj.studName)
    println("Age of sudent is "+studObj.age)
    println()
  // println( "student is "+ Student("Swapnil",22))// output: student is Student@7c30a502

    var studObj1=Student("Swapnil",50)
    println("age is "+ studObj1.age + "name is" + " "+studObj1.studName)
    println()

    //default values constructor
    println("teacher 1")
    val teacher1=Teacher("bhagya",89)
    println("teacher 2")
    val teacher2=Teacher("Sunita")
    println("teacher 3")
    val teacher3=Teacher()

}

class Student(var studName:String?=null,var age:Int?=9)
{

}

class Teacher(var teacherName:String?="unknown",var teacherAge:Int=0)
{
     init
     {
         println("Teacher Name is $teacherName")
         println("Teacher age is $teacherAge")
     }
}