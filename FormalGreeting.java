import java.util.Scanner;
import java.lang.String;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class FormalGreeting {
     
    public static void main(String[] args) {
        
        String name;      
        final String MISS = "Miss", MRS = "Mrs.", MS = "Ms.", MR = "Mr.";   //Introduces the string constants to the application.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        
        System.out.print("Please enter your name: ");   //Prompts the user for their name.
        name = input.nextLine();  //Takes the user's input.
        
        if (name.substring(0,4).equals(MISS)  name.substring(0,4).equals(MRS)  name.substring(0,3).equals(MS)){     //An if statement that checks for the strings (Miss, Mrs. or Ms.) and if any of them were present, it would print out "Hello, ma'am".
            
            System.out.println("Hello, ma'am");
            
        } else if (name.substring(0,3).equals(MR)){     
            
            System.out.println("Hello, sir");
            
        } else {    
            
            System.out.println("Hello " + name);
            
        }
        
        
    }
}