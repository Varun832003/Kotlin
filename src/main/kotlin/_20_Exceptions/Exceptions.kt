package _20_Exceptions

import java.lang.NumberFormatException

// Note: All exceptions inherit from the super class "Exception"
// If we will not handle the exception through try and catch block , the exception will crash the program
fun main(){
    val a = 4.0
    val b = 0.0
    val division= try {
        divide(a,b)
    }catch (e: DivisionByZeroException){
        0.0
    }
    println("The result of division is : $division")

    println("Enter a number: ")
    val input = try {
        readlnOrNull()?.toInt()
    }catch (e:NumberFormatException){
        0
    }finally // this block of code is always executed
     {
        println("This is from the final block")
    }
}
// How to create our exception...

class DivisionByZeroException: Exception("You can't divide by zero. Please choose another number.")

fun divide(a:Double,b:Double):Double{
    if (b==0.0){
        throw DivisionByZeroException()
    }
    return a/b
}