import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which factoril you need:");
        int num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;


        }
        System.out.println("Factorial of the given number is :"+fact);
        int fact1=1;

        for(int i=num;i>=1;i--)
        {
            fact1=fact1*i;


        }
        System.out.println("Factorial of the given number is :"+fact1);
        
    }
    
}
