import java.util.Scanner;

public class Star6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stars:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=num-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();

        }
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=1;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                
                }
                else
                {
                    System.out.print(" *");
                }
                
            }
            System.out.println();
        }
    }
    
}
