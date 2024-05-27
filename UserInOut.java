import java.util.Scanner;

public class UserInOut {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        System.out.println("Enter your mobile no:");
        long mob= sc.nextLong();
        System.out.println(name+age+mob);
        
    }
    
}
