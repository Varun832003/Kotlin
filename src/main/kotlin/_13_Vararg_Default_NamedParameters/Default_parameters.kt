package _13_Vararg_Default_NamedParameters

fun main(){
    searchFor("How to become a good programmer")
    searchFor("How to beacome kotlin programmer","Bing")

    searchFor(searchEngine = "Bing", search = "How to earn money online") // --> Named parameters.
    // Named parameters are helpful when there are so many parameters in a function.
}
fun searchFor(search:String, searchEngine:String = "Google"){
    println("Searching for '$search' on $searchEngine")
}