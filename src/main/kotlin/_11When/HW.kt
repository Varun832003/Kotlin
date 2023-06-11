package _11When
fun main(){
    print("Enter your country: ")
    val country = readlnOrNull()
    when(country){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hello")
        else -> println("I don't know")

    }
}