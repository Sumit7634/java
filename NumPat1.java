import java.util.Scanner;

public class NumPat1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num= sc.nextInt();
        int count =0;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count=count+1;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    
}
