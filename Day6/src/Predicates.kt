fun main(args:Array<String>)
{
    var intList = listOf<Int>(1,2,100,200,3300,2,3,500,435,7899)

    var predicateNum = {num:Int -> num >= 100}

    //check all return boolean value
    var checkAll = intList.all(predicateNum)
    println(checkAll)

    //Check any means if find aout one answer then return true
    var checkAny = intList.any(predicateNum)
    println(checkAny)

    //return count to match predicate
     var countPredicate = intList.count(predicateNum)
    println(countPredicate)

    //returns the First element which match to preticate
    var findPredicate = intList.find(predicateNum)
    println(findPredicate)

    var filterFun = intList.filter(predicateNum)
    println(filterFun)

    var mapFun = intList.map{num:Int -> num+10}
    println(mapFun)
}