package _14_Classes

import _16_AbstractClasses.Shape
import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
):Shape("Triangle") {
    val s = (a+b+c)/2.0
    init {
        println("$name created with a = $a, b = $b and c = $c")
    }
    override fun perimeter() = a+b+c

    override fun area() = sqrt(s*(s-a)*(s-b)*(s-c))
}