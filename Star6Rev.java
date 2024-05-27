import java.util.Scanner;

public class Star6Rev {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stars:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=num;k>=i;k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
