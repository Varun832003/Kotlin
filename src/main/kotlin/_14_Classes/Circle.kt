package _14_Classes

import _16_AbstractClasses.Shape

class Circle(
    val radius: Double
): Shape("Circle") {
    init {
        println("Circle of radius $radius is created")
    }

    override fun area(): Double = 3.14*radius*radius



    override fun perimeter(): Double {
        return 2*3.14*radius
    }
}