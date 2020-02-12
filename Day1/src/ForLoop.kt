fun main(args:Array<String>)
{
    for(item in 1..10)
        println(item)

    println()
    println("Nothing to print")

    for(item in 5..0) //
        println(item)

    for(item in 1..10 step 8)
        println(item)

    var arr= arrayOf("Mona","Bhagya","kiran","pooja","shweta")
    for(i in arr)
    {
        println("name of $i "+i)
    }
     var name="Bhagyashri"
    for(letter in name)
        println("Letter is " +letter)

}