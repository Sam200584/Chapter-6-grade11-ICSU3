import java.util.Scanner;  
/*

Name: Sam Tayefeh
Class: Grade 11 Computer Science
Teacher: Mr. Benum

*/
public class cubesum 
{  
    public static void main(String args[])   
    {  
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();  
        int sum=0;  
        while(n>0)  
        {  
            int r=n%10;  
            sum=sum+r*r*r;  
            n=n/10;  
        }  
        System.out.println(sum);  
    }  
    
}
