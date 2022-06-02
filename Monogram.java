import java.util.Scanner;
import java.lang.String;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class Monogram {
     
    public static void main(String[] args) {
        
        String name, middleName, lastName;      
        Scanner input = new Scanner(System.in);     //Introduces the scanner.
        
        System.out.print(" first name: ");     //Prompts the user for their first name.
        name = input.nextLine();    //Takes the user's input.
        System.out.print(" middle name: ");
        middleName = input.nextLine();
        System.out.print(" last name: ");
        lastName = input.nextLine();
        
        System.out.println(name.substring(0,1).toLowerCase() + middleName.substring(0,1).toUpperCase() + lastName.substring(0,1).toLowerCase());   
        
        input.close();
    }
}
