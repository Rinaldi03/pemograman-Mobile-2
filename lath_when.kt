fun main (args:Array<String >)
{
    val namber = 12
    when (namber) {
        3, 4, 5, 6 ->
            println("It is summer season")
        6, 7, 8,9 ->
            println("it is rainy season")
        8, 10, 11 ->
            println("it is autumn season")
        10, 12, 1 ,2 ->
            println("it is winter season")
        else -> {
            println("Invalid Input")
        }
    }


}
