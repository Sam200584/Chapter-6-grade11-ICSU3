import java.util.Scanner;
import java.lang.String;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class passwordchecker {
     
    public static void main(String[] args) {
        
        String guess;      //Intro
        final String PASSWORD = "ThisIsThePassword";   //Introduces the string constants to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        
        System.out.print("First try: ");     //Prompts the user for a password.
        guess = input.nextLine();   //Takes the user's input.
        
        if (guess.equals(PASSWORD)){   
            System.out.println("Access Granted");
            
        } else{
            
            System.out.print("Second try: ");
            guess = input.nextLine();
            
            if (guess.equals(PASSWORD)){
                
                System.out.println("Access Granted");
                
            } else{
                
                System.out.print("Third try: ");
                guess = input.nextLine();
                
                if (guess.equals(PASSWORD)){
                    
                    System.out.println("Access Granted");
                    
                } else{
                    
                    System.out.println("Access Denied");
                    
                }
                
            }
        }
        input.close();

    }
}