package _21_Lambda_Functions

import _14_Classes.Circle
import _16_AbstractClasses.Rectangle
import _14_Classes.Triangle

fun main(){
    // 1st implementation of lambda function
    var list1 = (1..20).toList()
    println(list1)
    list1 = list1.filter { it % 2 == 0 }
    //1. filter function is a lambda function
    //2. 'it' refers to each item in the list
    //3. All the elements that satisfies the condition in the curly braces are filtered in and the rest are filtered out
    //4. filter function already exists, but we can provide our own implementation inside it.
    println(list1)

    // 2nd implementation of lambda function
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0,4.0,4.0)
    val triangle2 = Triangle(3.0,3.0,3.0)
    val rectangle1 = Rectangle(6.0,6.0)
    val rectangle2 = Rectangle(4.0,3.0)

    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)
    shapes = shapes.filter { it.area() > 20 }
    for(shape in shapes){
        println("${shape.name} area is : ${shape.area()}")
    }
    println()

    // Another implementation
    shapes = shapes.sortedBy { it.area() }
    // shapes will be sorted according to the area of the shape
    for(shape in shapes){
        println("${shape.name} area is : ${shape.area()}")
    }
}
