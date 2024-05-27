import java.util.Scanner;

public class Palindrom {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();
        int temp=num;
        int rev=0;
        int rem;

        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;


        }
        System.out.println(rev);
        if(num==rev)
        {
            System.out.println("The given number "+num+" is palindrom number");
        }
        else
        {
            System.out.println("The number is not a palindrom number");
        }
    }
    
}
