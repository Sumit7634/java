import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        String yn;
        do{
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();
        System.out.println("Enter the symbol(+,-,*,/)");
        String Symb=sc.next();
        switch(Symb)
        {
            case "+": res=num1+num2;
            System.out.println("Addition is"+res);
            break;
            case "-": res=num1-num2;
            System.out.println("Difference is"+res);
            break;
            case "*" :res=num1*num2;
            System.out.println("Product is:"+res);
            break;
            case "/": res=num1/num2;
            System.out.println("Division is"+res);
            break;
            default:
            System.out.println("Invalid symbol");
            break;
            

            
        }

    }
    System.out.println("If you want to continue press Y for ye N for no");
    String yn = sc.next();
    While(yn.equals ("Y")|| yn.equals("y"));
    }
    
}
