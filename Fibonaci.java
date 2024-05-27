import java.util.Scanner;

public class Fibonaci {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b= sc.nextInt();
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=10;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
    
}
