import java.util.Scanner;

public class NumPat6 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            int no=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+no);
                no=no+num-j;
            }
            System.out.println();
        }
    }
    
}
