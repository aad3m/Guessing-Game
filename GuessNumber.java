import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args){
        System.out.println("Hello! Let's play a guessing game! ");
        int a = 1;
        int b = 10;
        // Generates random number between a & b
        int randomnum = (int) (Math.random()*(b-a+1)) + a;

        // Get user input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Guess a number between " + a + " & " + b + ": ");
        int userinput = scnr.nextInt();

        // Compare user input and random number
        int attempts = 0;
        while (userinput != randomnum){
            if (userinput > randomnum) {
                System.out.print("Toooo Highh!!: ");
                userinput = scnr.nextInt();
            }
            else if (userinput < randomnum) {
                System.out.print("Toooo Loww!!: ");
                userinput = scnr.nextInt();
            }
            attempts ++;
        }
        // When number is right
        System.out.println("You guessed it in " + attempts + " tries!! ");



    }
}
