import java.util.Scanner;

public class StarNew {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row= sc.nextInt();
        System.out.println("Enter the columns:");
        int col= sc.nextInt();
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || j==col || j==1 || i==row)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    
}
