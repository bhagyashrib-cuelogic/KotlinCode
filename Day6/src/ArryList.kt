fun main(args:Array<String>)
{
    ArrayList()
    println()
    println("Array list of ")
    ArrayListOf()
}
fun ArrayList()
{
    var arrayList1=ArrayList<String>(0)
    arrayList1.add("Bhagya")
    arrayList1.add("swapnil")
    arrayList1.add("pooja")
    arrayList1.add("Kajal")
    arrayList1.add("neel")
    arrayList1.add("nikita")
    arrayList1.add("dular")

    println("Size of arralist is "+arrayList1.size)
    println("Display array List")
    for(i in arrayList1)
        print("$i\t")
    println()
    println("Index of "+arrayList1.indexOf("nikita"))
}
fun ArrayListOf()
{
    var arrayList = arrayListOf<Int>(1,2,3,4,5)
    arrayList.add(1,22)
    for(i in arrayList)
        println("$i\t")
}