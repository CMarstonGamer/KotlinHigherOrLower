import java.util.Scanner
fun main(args: Array<String>) {
        var secretNumber= (1..20).random()
        var noOfGuesses = 0
        println("Enter a number between 1 and 20")
        val guessReader = Scanner(System.`in`)

    var finished = false
    while(!finished){
        noOfGuesses++
        var guess: Int =guessReader.nextInt()
        if(guess>secretNumber){
            println("Lower!")
        } else if(guess<secretNumber){
            println("Higher!")
        } else{
            println("You win! The secret number was: $secretNumber")
            finished=true
        }
    }
}