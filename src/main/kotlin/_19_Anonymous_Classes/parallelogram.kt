package _19_Anonymous_Classes

import _16_AbstractClasses.Shape

fun main(){
    val a = 3.0
    val b = 4.0
    val height = 2.0
    val parallelogram = object: Shape("Parallelogram",a,b,height){

        // The above object is inherited from Shape class, so we need to implement abstract functions
        init {
            println("Parallelogram created with sides a = $a and b = $b")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }
        override fun area(): Double {
            return b*height
        }

        override fun perimeter(): Double {
            return 2*a + 2*b
        }

        fun isRectangle(): Boolean = b==height

    }
    println("Is the parallelogram a rectangle? ${parallelogram.isRectangle()}")
}