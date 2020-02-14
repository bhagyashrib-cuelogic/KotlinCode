fun main(args:Array<String>)
{
    addition()
    sub(9,mul()) //Pass function as parameter
}
fun addition()
{
    val mul:(Int,Int)->Int ={a,Mult ->a*Mult }
    //val ans=mul(3,4)
    val addition = mul(3,4)+4
    println("Addition is "+addition)
}
fun sub(a:Int,mul:Int)
{
    val sub=a-mul
    println("Sub is "+sub)
}
fun mul():Int
{
    return  1*7
}
