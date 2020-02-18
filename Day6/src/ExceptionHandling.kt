import java.io.IOException

fun main(args:Array<String>)
{
    exception()
    ExceptionHandling()
    thowsException()
}

fun exception()
{
    try {
        var num = 1 / 0
        println(num)
        var Array = arrayOf(1, 2, 3, "Bhagya", 3)
    }
    catch(e:ArithmeticException){
           println(e)
    }
    finally {
        println("Excuted block")
    }
}
fun ExceptionHandling()
{
    var Array= arrayOf(1,2,3,"Bhagya",3)
    try {
        Array.set(6,9)
        for(i in Array)
            print("$i\t")
    }
    catch(e:ArrayIndexOutOfBoundsException)
    {
        println(e)
    }
}

fun thowsException()
{
    var marks=56
    if(marks>60)
            println("Student pass")
      throw ArithmeticException("Fail")
}