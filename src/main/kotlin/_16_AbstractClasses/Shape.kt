package _16_AbstractClasses

import java.awt.Dimension

abstract class Shape( // We can not create instance/Object of Abstract Class--> main utility of abstract class
    var name: String
) {

    // Created constructor to demonstrate application of anonymous classes
    constructor(name: String, vararg dimension: Double): this(name)
    init {
        println("I am the super class!")
    }
    abstract fun area():Double // 1. abstract functions can only be created in abstract class
                                //2. We only define the abstract function and do not implement it in the abstract class
    abstract fun perimeter(): Double // 3. Abstract function is implemented in the class that is Inheriting the abstract class.
    fun changeName(newName: String){
        name = newName
    }
}