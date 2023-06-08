package `_9 Loops`

import kotlin.math.pow

fun main(){
    print("Enter first number: ")
    val num1 = readLine()
    print("Enter second number: ")
    val num2 = readLine()
    if(num1 != null && num2 != null){
        val ans = num1.toDouble().pow(num2.toDouble())
        print("$num1 raise to the power $num2 is: $ans")
    }
}