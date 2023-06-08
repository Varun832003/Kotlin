package `_9 Loops`

fun main(){
    print("Enter a number: ")
    val num = readLine()
    println("Lets count down from $num to 0")
    if(num != null){
        var i=num.toInt()
        while(i>=0) {
            println(i)
            i--
        }
    }

}
