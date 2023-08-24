package _18_Object_and_CompanionObject

import kotlin.random.Random

class Sphere(
    val radius:Double
) {
    // This object has a singleton behaviour but we can create intance indirectly!
    companion object{
        fun randomSphere():Sphere{
            val radius = Random.nextDouble(1.0,10.0)
            return Sphere(radius)
        }
    }
    init {
        println("Sphere of radius $radius is created!")
    }
    fun area():Double = 4*ImportantNumbers.PI*radius*radius
}