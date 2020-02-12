import java.util.*
import java.util.Scanner

fun main(args:Array<String>)
{
     val sc=Scanner(System.`in`)
     println("Enter two numbers");
     val num1=sc.nextInt();
     val num2=sc.nextInt()

    //Addition
    var add=num1+num2
    println("addition is "+add)

    //subtracrion
    var sub=num1-num2
    println("subtraction is "+sub)

    //multiplication
    var mul=num1*num2
    println("multiplication is "+mul)

    //division
    var div=num1/num2
    println("division is "+div)

    //remainder
    var rem=num1%num2
    println("remainder is 7" +
            "9"+rem)

    //convert data types
    var number=12;
    println(number.toFloat())
    println(number.toDouble())
    println(number.toLong())
    println(number.toString())
}