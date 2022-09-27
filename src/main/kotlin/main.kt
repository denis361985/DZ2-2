fun main () {

    val likes = 111
    val likesStringLength = likes.toString().length
    val penultimateSymbol = if (likesStringLength > 1) likes.toString()[likesStringLength - 2] else '0'
    val ending = if (likes % 10 == 1 && penultimateSymbol != '1') "человеку" else "людям"

    println("Понравилось: $likes $ending")
}