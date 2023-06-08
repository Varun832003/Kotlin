package `_9 Loops`

fun main(){
    var x = 3
    while(x>0){
        println("hello")
        x--
    }
    println("Came out of loop")

    val myArray = arrayOf("hello","guys","what's up")
    val arrayLength = myArray.size
    var i=0
    while(i<arrayLength){
        println(myArray[i])
        i++
    }
}