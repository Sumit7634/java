import java.util.Scanner;

public class FactorialByReccursion {
    static int fact=1;
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int res;
        FactorialByReccursion f = new FactorialByReccursion();
        res=f.calFact(num);
        System.out.println("Factorial is "+res);

        
    }
    int calFact(int num)
    {
        if(num>=1)
        {
            fact =fact*num;
            calFact(num-1);
        

        }
        return fact;
    }
    
}
