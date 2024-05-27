import java.util.Scanner;

public class NumPat7 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row= sc.nextInt();
        System.out.println("Enter the columns:");
        int col= sc.nextInt();
        int count=0;
        for(int i=1;i<=row;i++)
        {
            
            if(i%2!=0)
            {
                for(int j=1;j<=col;j++)
                {
                    count=count+1;
                System.out.print(" "+count);

                }
        
            }
            else
            {
                int temp=count+1;
                for(int j=count+col;j>=temp;j--)
                {
                    count=count+1;
                System.out.print(" "+j);

                }
            }
            
            System.out.println();
        }
    }
    
}
