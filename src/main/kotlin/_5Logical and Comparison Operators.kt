fun main(){
//    val x = 4
//    val y = 5
    val a = 9
    val b = 10
//    println(x==y)
//    println(x==y && a==b)

    val simpleExpression = 3>4 || 4>3 && 4<=4
    println(simpleExpression)

    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x+y) && (!bool || y<z)
    print(hardExpression)
}