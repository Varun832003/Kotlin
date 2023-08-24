package _12_FunctionsAndparameters

fun List<Int>.product():Int{
    var product = 1
    for (i in this){
        product *= i
    }
    return product
}
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
    println("The product of $list is ${list.product()}")

}