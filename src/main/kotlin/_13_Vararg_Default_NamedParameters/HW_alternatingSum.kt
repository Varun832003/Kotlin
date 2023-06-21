package _13_Vararg_Default_NamedParameters

fun main(){
    val altSum = alternatingSum(3,4,5,2,1,2,3)
    println(altSum)
}
fun alternatingSum(vararg numbers:Int):Int{
    var sum = 0
    for(i in numbers.indices){
        if(i%2 == 0){
            sum += numbers[i]
        }else{
            sum -= numbers[i]
        }
    }
    return sum
}