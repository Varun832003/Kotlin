package _12_FunctionsAndparameters

fun main(){
    var result = 0
//    printLines()
    println("Enter base: ")
    val base = readlnOrNull()?.toInt()
    println("Enter exponent: ")
    val expo = readlnOrNull()?.toInt()
    if(base != null && expo != null){
         result = pow(base,expo)
    }
    println(result)

}
fun printLines(){
    println("hello")
    println("Hi")
    println("There")
}
fun pow(base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    return result
}