import java.util.Scanner;

/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/

public class SumDigits
{
    public static void main(String arg[])
    {
        int num, sum;   //Introduces the integer variables.
        Scanner input = new Scanner(System.in);     //Introduces the scanner.


        num = input.nextInt();  //Takes user input.

        for(sum = 0;num != 0;num /= 10)     //A for loop that keeps dividing the user's input by 10 until it's 0 and adds the remainder to sum while it does that.
        {

        sum += num%10;

        }

        System.out.println(sum);

    }
}