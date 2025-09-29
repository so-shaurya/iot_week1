//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val tooLow:(Int) -> String={"Your guess $it is too low! Try again"}
    val tooHigh:(Int)-> String={"Your guess $it is too high! Try again"}
    val correct:(Int)-> String={"Congratulations! $it is correct"}
    var number = (1..20).random()
    while(true) {
        println("Guess the number")
        var guessNumber = readLine()?.toIntOrNull()
        if (guessNumber == null) {
            println("Invalid input! Please enter a number.")
        }
        else if (guessNumber == number){println(correct(guessNumber))
            break}
        else if (guessNumber > number){println(tooHigh(guessNumber))}
        else {println(tooLow(guessNumber))}
    }

}