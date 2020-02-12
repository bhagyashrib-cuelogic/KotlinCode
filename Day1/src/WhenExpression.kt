import java.util.Scanner
fun main(args:Array<String>)
{
    //when expression
    var sc = Scanner(System.`in`)
    println("Enter a number  between 1 to 5")
    var number=sc.nextInt()

    when(number)
    {
        1 -> println("its 1")
        2 -> println("its 2")
        3 -> println("its 3")
        4 -> println("its 4")
        5 -> println("its 5")
        else ->
        {
            println("Wrong choice")
        }
    }
}