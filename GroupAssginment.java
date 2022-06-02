import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class GroupAssginment {

   public static void main(String [] args) {

      String lastName; 

      Scanner input = new Scanner(System.in);  

    
      System.out.print(" Last name: ");    //Prompts the user for their last name.
      lastName = input.nextLine();  //Takes the user's input.

      input.close();

       

      if ('A' <= lastName.charAt(0) && lastName.charAt(0) <= 'I') {    

         System.out.println(" Group 1");

      } else if ('J' <= lastName.charAt(0) && lastName.charAt(0) <= 'S') {  
         System.out.println(" Group 2");

      } else {      

         System.out.println(" Group 3");
         
      }
   }
}
