package _14_Classes

fun main(){
    val myTriangle = Triangle(3.0,4.0,5.0)
    println("Perimeter = ${myTriangle.perimeter()}")
    println("Area = ${myTriangle.area()}")
    println(myTriangle.name)
    myTriangle.changeName("newTriangle")
    println("New name of the triangle is: ${myTriangle.name}")

}