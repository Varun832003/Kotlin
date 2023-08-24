package _16_AbstractClasses
import _16_AbstractClasses.Shape

//primary constructor
class Rectangle(
    val a: Double,
    val b: Double
) : Shape("Rectangle"){

    // Secondary constructor(Constructor overloading)
    constructor(a:Double):this(a,a)
    constructor(a:Int,b:Int):this(a.toDouble(),b.toDouble())
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