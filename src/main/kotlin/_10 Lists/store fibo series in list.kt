package `_10 Lists`

fun main(){
    val list = mutableListOf<Int>()
    print("Enter the value of n: ")
    val n = readLine()?.toInt()
    list.add(0)
    list.add(1)
    if(n != null){
        for(i in 2 until n){
            list.add(list[i-2]+list[i-1])
        }
    }
    println(list)
}