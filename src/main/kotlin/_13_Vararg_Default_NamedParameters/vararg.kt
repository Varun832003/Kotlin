package _13_Vararg_Default_NamedParameters

fun main(){
    val arr = intArrayOf(10,20,30)
    var max = getMax(1,2,3,4,5)

    // can also insert an array like this-
    max = getMax(1,2,3,*arr,7)
    print("The maximum number is $max")
}
fun getMax(vararg numbers:Int):Int{
    var max = numbers[0]
    for(number in numbers){
        if(number>max){
            max = number
        }
    }
    return max
}