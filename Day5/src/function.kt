import java.util.Scanner
fun main(args:Array<String>)
{
    val x:Double=2.00
    val y:Double=3.00
    val power=Math.pow(x,y) //Standard Kotlin Function
    println("Power is $power")
    println()
    //Addition
    add()
    println()
    //Subtraction
    println("Subtraction is "+subtraction())
    println()
    //Multiplication
    multiplication(4,5)
    println()
    //Division
    val Div=division(10,2)
    println("Divison is "+Div)
    println()
    //Recursion
    println("Factorial is "+factorial(4))
    println("addition in recusrion "+recursionAdd(5))
}
//Simple function
fun add():Unit //its like void nothing to return
{
    val sc = Scanner(System.`in`)
    println("Enter two numbers")
    val a=sc.nextInt()
    val b=sc.nextInt()
    val add=a+b
    println("Addition is "+add)
}
// return function
//It has always type return
fun subtraction():Int
{
    val sc = Scanner(System.`in`)
    println("Enter two numbers")
    val a=sc.nextInt()
    val b=sc.nextInt()
    val sub=a-b
    return sub
}
//Paramterize function
fun multiplication(a:Int,b:Int)
{
    val mul=a*b
    println("Multiplication is "+mul)
}
//return type with parameterize
fun division(a:Int,b:Int):Int
{
    return a/b
}
//Recusrion
fun factorial(fact:Int):Int
{
    if(fact==1)
        return 1
    else
        return fact*factorial(fact-1)
}
//tail recusrion
tailrec fun recursionAdd(num:Int,sum:Int=0):Int
{
    if(num==0)
        return sum
    else
        return recursionAdd((num-1),(sum+num))
}
//E