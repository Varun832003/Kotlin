package _11When

fun main(){
    print("Enter your age: ")
    val age = readlnOrNull()?.toInt()

//    if(age in 0..5){
//        println("You are a kid")
//    }else if(age in 6..17){
//        println("you are a teenager")
//    }else if (age == 18){
//        println("Finally, you are 18")
//    }else if(age == 19 || age == 20){
//        println("You are a young adult")
//    }else if( age in 21..65){
//        println("You are an adult")
//    }else{
//        println("You are really old")
//    }

    // These if conditions can be replaced with "when" condition

    when(age){
        in 0..5 -> println("You are young kid")
        in 6..17 -> println("You are a teenager")
        18 -> println("Finally, you are 18")
        19,20 -> println("You are a young adult")
        in 21..65 -> println("You are an adult")
        else -> println("You are really old")
    }
}