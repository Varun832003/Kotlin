package `_10 Lists`

fun main(){
    val array = arrayOf(1,2,3,4) // arrays are mutable
    val list = listOf(1,2,3)// list us immutable

    array[0] = 3 // valid
   // list[0] = 3 --> invalid
    // but we can create mutable list
    val list2 = mutableListOf(1,2,3)
    list2[0] = 4 // valid
    /* Difference between mutable List and array is that mutable list size can be changed at runtime while array size is fixed once
     declared */
    /* For E.g. */
    list2.add(5)
    println(list2)

    list2.remove(2) // removes the element 2
    println(list2)

    list2.removeAt(0)
    println(list2)


}
