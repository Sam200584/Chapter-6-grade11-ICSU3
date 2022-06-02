import java.util.Scanner;
import java.text.DecimalFormat;
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class PowersTable {


  public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0");
    Scanner scan = new Scanner(System.in);
    int x=1;
    
    System.out.println("X^1\tX^2\tX^3\tX^4\tX^5\t");
    for (int i=1;  i<7; i++)
    System.out.println(df.format(Math.pow(i,1)) + "\t"+df.format(Math.pow(i,2)) + "\t"+df.format(Math.pow(i,3)) + "\t"+df.format(Math.pow(i,4)) + "\t"+df.format(Math.pow(i,5)) + "\t");
    
  }

}