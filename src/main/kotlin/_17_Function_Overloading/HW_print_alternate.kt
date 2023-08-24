package _17_Function_Overloading

fun main(){
    val list = mutableListOf<Int>()
    val array = arrayOf(1,2,3,4,5)
    println("Enter the value of n: ")
    val n = readlnOrNull()?.toInt()
    if(n != null){
        for (i in 0 until n){
            println("Enter element $i : ")
            readlnOrNull()?.toInt()?.let { list.add(it) }
        }
    }
    print_Alternate(list)
    print_Alternate(array)
}

fun print_Alternate(list:List<Int>){
    println("List: $list")
    var first = 0
    var last = list.size-1
    while (first < last){
        println(list[first])
        println(list[last])
        first++
        last--
        if (first == last){
            println(list[first])
        }
    }
}
fun print_Alternate(array: Array<Int>){
    var first = 0
    var last = array.size-1
    while (first < last){
        println(array[first])
        println(array[last])
        first++
        last--
        if (first == last){
            println(array[first])
        }
    }
}