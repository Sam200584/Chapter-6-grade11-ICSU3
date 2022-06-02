import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class Factorial {

    public static void main(String[] args) {

    int num, factorial = 1;   //Introduces the variables to the program
    Scanner input = new Scanner(System.in); 
 
    System.out.println("Enter a number: ");     //Prompts the user for a number
    num = input.nextInt();   //Takes the user's input

    input.close();
 
    do{     

        factorial = factorial * num;
        num -= 1;
 
    } while(num > 0);
 
        System.out.println("Factorial: " + factorial);
 
    }

}