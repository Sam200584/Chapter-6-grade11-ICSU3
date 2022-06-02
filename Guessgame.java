import java.util.Scanner;
import java.util.Random;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class Guessgame
{
    public static void main(String[] args) {
 
        int number, guess;  //Introduces the integer variables.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.

      

        do{     //A do while loop that keeps prompting the user for their guess until they guess the number correctly or enter 0 to exit.

            System.out.print("Please enter a number between 1 and 20 (0 to exit): ");

            guess = input.nextInt();
            number = 15;

            if(guess == number){

                System.out.println("WINNER");

            } else{

                System.out.println("LOSER");

            }
        } while(guess != number && guess != 0);

    }
}