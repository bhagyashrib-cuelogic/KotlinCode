fun main(args:Array<String>)
{
    var firstList= listOf(1,"Bhagya",'a',2,3,5.55)
    for(i in 0..firstList.size-1)
         print("\t"+firstList[i])
        println()
    //firstList.add(4) show error coz list is immutable and fixed size elemet

    var intList:List<Int> = listOf<Int>(1,2,4,5)
    for( i in intList)
        print("$i\t")

    var stringList:List<String> = listOf<String>("Bhagya","swapnil","Akash","Shubham","Priyanka")
    //functions on List
    println()
    println(stringList.get(3))
    println(stringList.indexOf("swapnil"))
    println(stringList.lastIndexOf("Bhagya"))
    println(stringList.size)
    println(stringList.contains("Pooja"))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))
    println(stringList.subList(0,2))
    println("-----End Mutable  list------")
    MutableList()
}

fun MutableList()
{
     var mutableList = mutableListOf<Int>(1,2,3,4,5,5)
     println("Show Mutable list")
      for(i in mutableList)
          print("$i\t")
     println()

     mutableList.add(1,21)
        mutableList.add(23)
    println("Add elements")
     for(i in mutableList)
            print("$i\t")
        println()

    mutableList.remove(21)
    println("Remove specific element ")
    for(i in mutableList)
        print("$i\t")
    println()

    var mutableList1 = mutableListOf<Int>(11,22,33,44,55)
    println("Add one list into another list")
    mutableList.addAll(2,mutableList1)
    for(i in mutableList)
        print("$i\t")
     println()

    mutableList.removeAll(mutableList1)
    println("Remove one list from another")
    for(i in mutableList)
        print("$i\t")
    println()

    println("retain function")
    mutableList.retainAll(mutableList1)
    mutableList.addAll(mutableList1)
    for(i in mutableList)
        print("$i\t")
    println()

   // var arrayList = ArrayList<Int>(101,202)
    val arrayList: ArrayList<Int> = ArrayList<Int>(5)
    arrayList.add(303)
    println("add mutable list into array")
    arrayList.addAll(mutableList)
    for(i in arrayList)
        print("$i\t")
    println()

    println("Add array into mutable list")
    mutableList.addAll(arrayList)
    for(i in mutableList)
        print("$i\t")
    println()

    //println(mutableList.indexOf(4))
}