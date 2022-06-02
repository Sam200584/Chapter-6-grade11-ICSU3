import java.util.Scanner;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
 public class carrecall
{
// Main method
public static void main(String[] args)
{
    int model; //model number
    Scanner input = new Scanner(System.in);

    do
    {
    System.out.print("Enter the car's model number or 0 to quit: ");
    model=input.nextInt();
    input.close();
    }   
    while (model>0);
    {

        if (model==119)
            {
                System.out.print("Your car is defective. It must be repaired.");
            }
       else if (model==179)
            {
                System.out.print("Your car is defective. It must be repaired.");
            }   
       else if (model>=189 && model<=195)
            {
                System.out.print("Your car is defective. It must be repaired.");
            }   
       else if (model==221)
            {
                System.out.print("Your car is defective. It must be repaired.");
            }
       else if (model==780)
            {
                System.out.print("Your car is defective. It must be repaired.");
            }     
       else 
             System.out.print("Your car is not defective.");
       model=0; 
    }

}

}