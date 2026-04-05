import java.util.Scanner;
import java.util.Random;
public class number_guessing_game {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        Random r=new Random();

        int numberToGues=r.nextInt(50)+1; //1-50
        int guess=0;
        int attempts=0;

        System.out.println("welcome to number guessing game!");
        System.out.println("Guess a number between 1 and 50.");

        while(guess!=numberToGues){
            System.out.println("enter your guess: ");
            guess=s.nextInt();
            attempts++;

            if(guess<numberToGues){
                System.out.println("Too low! try again.");
            }
            else if(guess>numberToGues){
                System.out.println("Too high!Try again");
            }
            else{
                System.out.println("Congradulations! you guessed it in "+attempts+" attempts.");

            }
        }

        s.close();
    }

    
}

// sample output:

// welcome to Number guessing game!
// Guess a number between 1 and 50
// Enter your guess: 25
// Too low! try again.
// Enter your guess: 40
// Too high! try again.
// Enter your guess: 36
// Congradulatuons! you guessed it in 4 attempts.