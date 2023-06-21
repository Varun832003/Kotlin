package _12_FunctionsAndparameters

fun linearSearch(list:List<Int>,key:Int):Int{
    for(i in list.indices){
        if(list[i] == key){
            return i
        }
    }
    return -1
}
fun main(){
    val list = listOf(1,2,3,4,5,6,7)
    print("Enter the key: ")
    val key = readlnOrNull()?.toInt()
    var idx = 0
    if(key != null){
         idx = linearSearch(list,key)
    }
    if(idx != -1){
        print("Index of $key is $idx")
    }else{
        print("Key not found")
    }
}
