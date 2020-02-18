fun main(args:Array<String>)
{
    //ImMutable Map
    var myMap:Map<Int,String> = mapOf<Int,String>(1 to "Bhagya",22 to "Gaikwad",30 to "Bhushan")
    println("Dusplay Map")
    for(key in myMap.keys)
        println("$key : ${myMap[key]}")

    //accessing value by using key
    println("By using key "+myMap.getValue(22))
 //   println("By using key "+myMap.getValue(9)) key 9 is missing in the Map

    println("Check contain or not ${myMap.containsKey(1)}")
    println("Check contain or not ${myMap.containsKey(3)}")
    println("By get method ${myMap.get(1)}")

    println("By minus method ${myMap.minus(1)}") //22=Gaikwad,30=Bhushan
    println("By minus ${myMap.minus(30)}")

    hashMap()
    mutableHashMap()
}

fun hashMap()
{
    val hashMap :HashMap<Int,Char> = HashMap<Int,Char>()
    hashMap.put(1,'a')
    hashMap.put(2,'b')
    hashMap.put(3,'c')

    for(key in hashMap)
        print("$key\t")
    println()
    println("Map is ${hashMap.get(2)}")
    println("Check key ${hashMap.containsKey(1)}")
    println("check value ${hashMap.containsValue('x')}")

    hashMap.remove(2)
    for(key in hashMap)
        print("$key\t")
    println()

    hashMap.clear()
    println("Check key ${hashMap.containsKey(1)}")
    for(key in hashMap)
        print("$key\t")
}
fun mutableHashMap()
{
    var mutableMap:HashMap<Int,String> = HashMap<Int,String>()
    mutableMap.put(1,"Bhagya")
    mutableMap.put(10,"swapnil")
    mutableMap.put(2,"Swaraa")
    mutableMap.put(44,"Sujit")
     for (key in mutableMap.keys)
         print("$key : ${mutableMap[key]}\t")

    println("Count of map is ")
    println(mutableMap.count())

}
