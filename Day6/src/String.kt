fun main(args:Array<String>)
{
    val ch=charArrayOf('B','h','a','g','y','a');
    println(ch)
    val st=String(ch);
    println(st)
    stringfun()
    stringindices()
    equality()
//    val str1="Bhagya"
//    val str2="Bhag"
//    println(str1==str2)
//    println(str1===str2)
}
fun stringfun()
{
    var str1="Bhagya " +
             "gaikwad "+
             "pune " //escaped string

    var str2="""Gaikwad
       |Love India""".trimMargin()  //raw string

    println("First string is $str1")
    println(str2)
    str1="bhagyashri"
    println("$str1")

    val text = """Kotlin is official language  
        |announce by Google for  
        |android application development  
    """.trimMargin()

    println(text)
}

fun stringindices()
{
    println()
    val str1="Bhagya"
    println("Length of string is ${str1.length}")
    println("Indices of string ${str1.indices}") //0..5
    println("Last index of string is ${str1.lastIndex}") //5 //string arbitary expression
    println(str1[5])
  //  println(str1[6]) //java.lang.StringIndexOutOfBoundsException
    //println(str1[-1])//
}
fun equality()
{
    val str1="Bhagya"
    val str2="Bhagya"
    println(str1==str2)//structural equality
    println(str1===str2) //referential equality
}