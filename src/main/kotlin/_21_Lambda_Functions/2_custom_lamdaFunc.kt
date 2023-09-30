package _21_Lambda_Functions

import _14_Classes.Circle
import _14_Classes.Triangle
import _16_AbstractClasses.Rectangle
import _16_AbstractClasses.Shape

fun main(){
    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0,4.0,4.0)
    val triangle2 = Triangle(3.0,3.0,3.0)
    val rectangle1 = Rectangle(6.0,6.0)
    val rectangle2 = Rectangle(4.0,3.0)

    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)
    shapes = shapes.customFilter { it.area() > 20 }
    for(shape in shapes){
        println("${shape.name} area is : ${shape.area()}")
    }


}
fun List<Shape>.customFilter(filterFunction: (Shape) -> (Boolean)): List<Shape>{
    var resultList = mutableListOf<Shape>()
    for(shape in this){
        if(filterFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}