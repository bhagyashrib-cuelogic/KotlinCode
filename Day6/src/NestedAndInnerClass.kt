fun main(args:Array<String>)
{
    //Nested class
    var schoolObj=Teacher.Student()
    schoolObj.studentInfo()
    //Inner class
    var empObj=Employee().Employeeinfo()
    empObj.empInfo()
}
//Nested class
//not able to access outer class variable and methods
class Teacher {
   var nameTeacher = "Sangita"
    var teacherSubject = "Math"

    class Student {
        var studentName = "Bhagya"
        var studentId = 123
        fun studentInfo() {

            println("Student name is $studentName and Id is $studentId")
         //   println("teacher Name is $nameTeacher")
        }
    }
}

class Employee
{
    var companyName="Cuelogic"
   inner class Employeeinfo
    {
        var empName="Bhagya"
        var empId=223
        fun empInfo()
        {
            println("Employee Name is $empName and Id is $empId and compnat name is $companyName")
        }
    }
}

