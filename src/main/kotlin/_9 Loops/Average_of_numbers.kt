package `_9 Loops`

fun main(){
    var avg=0.0
    print("Enter number 1: ")
    val num1 = readLine()?.toInt()
    print("Enter number 2: ")
    val num2 = readLine()?.toInt()
    print("Enter number 3: ")
    val num3 = readLine()?.toInt()
    print("Enter number 4: ")
    val num4 = readLine()?.toInt()
    print("Enter number 5: ")
    val num5 = readLine()?.toInt()
    if(num1 != null && num2 != null && num3 != null && num4 != null && num5 != null ){
         avg = (num1+num2+num3+num4+num5)/5.0
    }
    print("Average = $avg")

}