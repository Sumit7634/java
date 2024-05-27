import java.util.Scanner;

public class DeciToInt {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number:");
        int deci = sc.nextInt();
        int power =1;
        int ans=0;

        while(deci>0)
        {
            int unit= deci%10;
            ans=ans+unit*power;
            power *=2;
            deci=deci/10;

        }
        System.out.println(ans);


    }
    
}
