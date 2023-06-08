package `_10 Lists`

fun main(){
    val list = mutableListOf<Int>()
    println("Enter the elements in the list: ")
    for(i in 1..5){
        val x = readLine()?.toInt()
        if(x != null){
            list.add(x)
        }
    }
    println(list)
}