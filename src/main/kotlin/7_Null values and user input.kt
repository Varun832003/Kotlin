fun main(){
    val userInput = readLine()
    println(userInput?.toUpperCase())
    // readLine function returns a string and the "?" indicates that there is a possibility that it returns a null string.

    // Homework Problem
    print("Enter your age: ")
    val age = readLine()
    if(age != null){
        if(age.toInt() >0 && age.toInt() <19){
            print("You are not an adult.")
        }else if(age.toInt()>=19 && age.toInt()<50){
            print("You are an adult")
        }else{
            print("You are really really old")
        }
    }

}