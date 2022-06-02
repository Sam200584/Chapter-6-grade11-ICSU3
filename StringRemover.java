import java.util.Scanner;
 /*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class StringRemover{
    
   public static void main(String args[])
   {
       String sentence, word;  
       Scanner input = new Scanner(System.in);  //Introduces the scanner to the program.
 
       System.out.print("Enter a String : ");  
       sentence = input.nextLine();     //Takes user's input.
 
       System.out.print("Delete from the String : ");  //Prompts the user for a word to remove.
       word = input.nextLine();
 
       sentence = sentence.replaceAll(word, "");   
 
       System.out.print(sentence);       
       
       input.close();
   }
}
