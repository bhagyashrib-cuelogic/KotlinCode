import java.util.Scanner
fun main(args:Array<String>)
{
     val sc = Scanner(System.`in`)
     val book = Books()
     book.Display()

     val gift:Store =Gifts()
     println("Please choose your favorite item")
     println("1.Book 2.Gifts")
     var choice=sc.nextInt()
     when(choice)
     {
         1 -> book.nameDisplay()
         2 -> gift.nameDisplay()
    else ->
        println("Please choose correct option")
    }
}
abstract class Store
{
     var nameStore:String="Awsome"
    fun Display()
    {
        println("Welcome to our Store "+nameStore)
    }
   abstract  fun nameDisplay()
}
class Books:Store()
{
    override  fun nameDisplay()
    {
        println("We have lots of books for you")
        println("1.Mother Teresa \n 2.Wings of fire \n 3.Not without my daughter \n 4.The Letter")
    }
}
class Gifts:Store()
{
    override fun nameDisplay() {
        println("Hello,gifts for you")
        println("1.Teddy \n 2.Watch \n 3.Chocolates \n 4.Birds")
    }
}
