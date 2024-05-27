import java.util.Scanner;

public class PrimeBetweenNumbers {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1= sc.nextInt();
    System.out.println("Enter the second number");
    int num2= sc.nextInt();
    int temp=0;
    for(int i=num1;i<=num2;i++)
    {
        for(int j=2;j<=i-1;j++)
        {
            if(i%j==0)
            {
                temp=temp+1;
            }
        }
        
            if(temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp=0;
            }
        
    }
    }
    
}
