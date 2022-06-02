import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class DigitsDisplay
{
    public static void main(String args[])
    {
        int num, temp, digit;   //Introduces my integer variables.

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer:");   //Prompts the user for an integer.
        num = input.nextInt();    //Takes user input.
        Scanner.close();
        temp = num;

        while(num > 0)  //A while loop that divides the user's input by 10 for as long as the number is above 0.
        {

            num = num / 10;

        }

        while(temp > 0)     //A second while loop that gets the remainder of the number divided by 10, outputs it and then divides the number by 10 for as long as the number is bigger than 0.
        {

            digit = temp % 10;
            System.out.println(digit);
            temp = temp / 10;

        }
    }
}