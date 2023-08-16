package _12_FunctionsAndparameters

fun main(){
    val list = mutableListOf<Int>()
    println("Enter the value of n: ")
    var n = readlnOrNull()?.toInt()
    if(n != null){

    for(i in 0 until n){
       println("Enter number ${i+1}: ")
        readlnOrNull()?.toInt()?.let { list.add(it) }
    }
    }
    var product = 1
    for(i in list){
        product *= i
    }
    println("The product of $list is $product")

}