import java.util.Scanner;

public class Star9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stars:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i>=2 && j<=i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                
            }
            System.out.println();
    
        }
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                if(i>=2 && k>1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
    
        }
    }
    
}
