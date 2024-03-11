package Unit1.Lesson1_3

fun main(){
    /*
    - Create two integers
    - Create an if statement that prints out "Integer 1 is greater than Integer 2" if integer 1 is greater than integer 2
    - Use an else if statement to print out "Integer 1 is less than Integer 2" if integer 1 is less than integer 2
    - Use an else statement to print out "Integer 1 is equal to Integer 2" if integer 1 is equal to integer 2
     */
    val int1 = 5
    val int2 = 10

    if (int1 > int2) {
        println("Integer 1 is greater than Integer 2")
    } else if (int1 < int2) {
        println("Integer 1 is less than Integer 2")
    } else {
        println("Integer 1 is equal to Integer 2")
    }
}