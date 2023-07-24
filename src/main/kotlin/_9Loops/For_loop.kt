package _9Loops

fun main(){
    var myArray = arrayOf(1,2,3)
    for(i in myArray){
        println(i)
    }
    println()
    // OR
    for(i in 1..5){
        println(i)
    }
    println()

    for(i in 10 downTo 5 step 2){
        println(i)
    }
    println()
    for(i in 'a'..'z'){
        print(i)
    }
}

