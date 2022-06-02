
import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class prime
{
   public static void main(String args[])
   {

    int primeCheck;     //Integer variable for checking the numbers. 
    boolean prime = true;      //Boolean that confirms whether or not a number is prime. 
    Scanner input = new Scanner(System.in);     //Introduces the scanner.

    System.out.println("Enter a number :");  

    int num = input.nextInt();  //Assigns the input to the variable num (Integer).
    input.close();

    if(num <= 1000000){     //First if statement that checks whether or not the input is supported.

        for(int i = 2;i <= num/2;i++)   //For loop that checks if the input is a prime number.
        {

            primeCheck = num%i;

            if(primeCheck == 0)
            {
                prime = false;
            }

        }

        if(prime){  //Output for when the number is prime.

            System.out.println(num + " Yes");

        } else{     //Output for when the number is not prime.

            System.out.println(num + " No");

        }

    } else{     //Output for when the input is not supported.

        System.out.println("The number is not supported");

    }

}

}
