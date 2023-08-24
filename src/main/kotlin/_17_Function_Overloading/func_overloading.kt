package _17_Function_Overloading

import _14_Classes.Circle
import _14_Classes.Triangle
import _16_AbstractClasses.Rectangle
import _16_AbstractClasses.Shape

fun main(){
    val rectangle = Rectangle(4,5)
    val triangle  = Triangle(3.0,4.0,5.0)
    val circle = Circle(4.0)
    val maxAreaRectTriangle = maxArea(rectangle,triangle)
    val maxAreaRectTrianCircle = maxArea(rectangle,triangle,circle)
    println("Max area between rectangle and triangle is $maxAreaRectTriangle")
    println("Max area between rect, trinagle and circle is $maxAreaRectTrianCircle")
}
fun maxArea(shape1: Shape,shape2: Shape):Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1>areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape):Double{
    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}