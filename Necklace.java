import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
 

public class Necklace {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int num1;

            int num2;

            int num3;

            int counter = 0;

            int stop;

            int go;

            System.out.print("Enter the first starting number: ");

            num1 = scan.nextInt();

            System.out.print("Enter the second starting number: ");

            num2 = scan.nextInt();

            System.out.print(num1);

            System.out.print(num2);

            go = num1;

            stop = num2;
            do {

                num3 = (num1 + num2) % 10;

                System.out.print(num3);

                num1 = num2;

                num2 = num3;

                counter++;

            }
            while (num1 != go || num2 != stop);

          

 

        }

 

}