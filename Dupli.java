import java.util.Scanner;

public class Dupli{
    static int dup(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(dup(arr,n));
    }
    
}
