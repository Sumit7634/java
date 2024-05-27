import java.util.Scanner;

public class Star4Mix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=num-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=num;k>=i+1;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
