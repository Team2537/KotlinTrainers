package Unit1.Lesson1_5

/*
Create a function that takes two integers as arguments and returns the sum of those two integers.
Then create a main function that asks the user for two integers and prints the sum of those two integers.
 */

fun sumOfTwoIntegers(int1: Int, int2: Int): Int {
    return int1 + int2
}

fun main() {
    val int1 = 5
    val int2 = 10
    println("The sum of $int1 and $int2 is ${sumOfTwoIntegers(int1, int2)}")
}
