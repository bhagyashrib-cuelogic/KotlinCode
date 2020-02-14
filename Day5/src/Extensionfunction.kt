fun main(args:Array<String>)
{
     val empObj=Employee()
    empObj.employeeInfo("Bhagya",22)
    empObj.empSalary(4,333)
}

class Employee
{
    fun employeeInfo(empName:String,empId:Int)
    {
        println("Employee Name is $empName")
        println("Employee and is $empId")
    }
}
//Extension function
 fun Employee.empSalary(empMonth:Int,mntSalary:Int)
 {
     val empSalaryMonthly=empMonth*mntSalary
     println("Employee montly salary is $empSalaryMonthly")
 }