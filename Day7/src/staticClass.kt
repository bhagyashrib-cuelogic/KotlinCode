//by default parameter
@file:JvmName("kotlinVolume")
fun main(args:Array<String>)
{
    var vol =volumeClass(2,3)
    println("Volume is $vol")
    rectangleShape(breath = 12,length = 2)
}
@JvmOverloads
fun volumeClass(breath:Int,length:Int,height:Int=10):Int
{
    return breath*height*length
   // println("Volume is $volume")
}
//Named function
//Its a pure kotlin feature, Not present in java i.e It can not Interoperability
fun rectangleShape(length: Int,breath: Int)
{
    println("Length is $length")
    println("breath is $breath")
}