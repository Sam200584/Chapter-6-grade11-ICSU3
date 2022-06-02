import java.util.Scanner;
import java.lang.String;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class AccountSetup {

    public static void main(String[] args) {

        String s1, s2;      
        Scanner input = new Scanner(System.in);     //Introduces the scanner.

        System.out.print("Please enter your username: "); 
        s1 = input.nextLine();  //Takes the user's input.

        System.out.print("Please enter a password that is at least 8 characters long: ");  
        s2 = input.nextLine();  //Takes user's input.

        int length = s2.length();  

        while (length < 8){    

            System.out.print("Please enter a password that is at least 8 characters long: ");
            s2 = input.nextLine();
            length = s2.length();

        }

        System.out.println("Your username is " + s1.toLowerCase() + " and your password is " + s2.toLowerCase());

    }
}