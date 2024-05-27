import java.util.Scanner;

public class ArrayTest3 {
    static int countOccurences(int[] b, int x)
    {
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==x)
            {
                count++;
            }
            
        }
        return count;


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter the "+n+" elements of the array:");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x: ");
        int x  = sc.nextInt();

        System.out.println("Count of X "+countOccurences(b, x));
    }
    
}
