import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class VowelCounter
{
    
   public static void main(String args[]){
       
      int vowelCount = 0;   //Introduces the vowelCount variable to my program.
      String sentence;  //Introduces the sentence string to my program.
      Scanner input = new Scanner(System.in);   
      
      System.out.println("Enter a sentence:");  
      sentence = input.nextLine();  //Takes the user's input and assigns it to the sentence variable.

      for (int i = 0 ; i < sentence.length(); i++){    
          
        char ch = sentence.charAt(i);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){     
            
        vowelCount ++;
            
        }
      }
      
      System.out.println("Number of vowels: " + vowelCount);
    
      input.close();

   }
}
