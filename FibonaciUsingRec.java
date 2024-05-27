import java.util.Scanner;

public class FibonaciUsingRec {
    static int a=0,b=1,c;

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println(a+" "+b);
        System.out.println("Enter the number of fibonaci:");
        int i = sc.nextInt();
        FibonaciUsingRec ob = new FibonaciUsingRec();
        ob.printFib( i);
        

    }
    void printFib(int i)
    {
        if(i>=0)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printFib(i-1);
        }
    }
    
}
