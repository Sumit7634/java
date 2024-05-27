import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int t1=num;
        int len=0;
        while(t1!=0)
        {
            t1=t1/10;
            len=len+1;
        }
        int t2 =num;
        int rem;
        int arm=0;
        while(t2!=0)
        {
            rem=t2%10;
            int mul =1;
            for(int i=1; i<=len;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(num==arm)
        {
            System.out.println("The given number "+num+" is armstrong");
        }
        else
        {
            System.out.println("The given number is not an armstrong number");
            
        }

    }
    
}
