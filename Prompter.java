import java.util.Scanner; 
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/

public class Prompter { 

    public static void main(String[] args) {
         (Scanner input = new Scanner(System.in)) {
            int min, max, num; //Variables to hold user's min and max values
               System.out.print("Enter a minimum number: "); //Ask user for minimum number
                min = input.nextInt(); //Collect minimum number
                System.out.print("Enter a maximum number: "); //Ask user for maximum number
               max = input.nextInt(); //Collect maximum number
                do { 
                    System.out.print("Enter a number between "+min+" and "+max+": "); //Ask for a number between min and max
                    num = input.nextInt(); //Collect number from user
                } while ((num < min)||(num > max)); //Loop if number is not between min and max
        }
    }
}