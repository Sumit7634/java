import java.util.Scanner;

public class IntToDeci {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int num= sc.nextInt();
        int ans=0;
        int power =1;
        while(num>0)
        {
            int parity = num%2;
            ans = ans+(parity*power);
            power*=10;
            num=num/2;
            
        }
        System.out.println(ans);

    }
    
}
