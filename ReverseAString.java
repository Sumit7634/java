import java.util.Scanner;

public class ReverseAString {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String name = sc.next();
        String rev ="";
        int len =name.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("The reverse of the String is :"+rev);
    }
    
}
