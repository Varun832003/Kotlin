package `_10 Lists`

fun main(){
    val list = mutableListOf<Int>()
    println("Enter the elements:")
    for(i in 1..5){
        var x = readLine()?.toInt()
        if(x != null){
            list.add(x)
        }
    }
    list.reverse()
    println("5 numbers in reverse order are:")
    for(i in list){
        println(i)
    }
}