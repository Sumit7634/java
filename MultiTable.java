import java.util.Scanner;

public class MultiTable {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication you need:");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int res=num*i;
            System.out.println(num+"X"+i+"="+res);
        }
    }

    
}
