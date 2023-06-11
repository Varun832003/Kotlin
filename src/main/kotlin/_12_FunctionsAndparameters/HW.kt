package _12_FunctionsAndparameters

fun main(){
    print("Enter the value of n: ")
    var result = 0;
    val n = readlnOrNull()?.toInt()
    if(n != null){
         result = sum(n)
    }
    println("The sum from 1 to $n is: $result")
}
fun sum(n:Int):Int{
    var result = 0
    for(i in 1..n){
        result += i
    }
    return result
}