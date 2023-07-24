package _16_AbstractClasses
import _16_AbstractClasses.Shape

class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle"){
    init {
        println("$name created with sides $a and $b")
    }

    override fun area(): Double {
        return a*b
    }

    override fun perimeter(): Double {
        return 2*a + 2*b
    }
}