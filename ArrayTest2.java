import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("The given array is :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int count=0;
        System.out.println("Enter the element whose occurence needed to check:");
        int x =sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==x)
            {
                count++;
            }
            
        }
        System.out.println("The occurence of "+x+" in the array is : "+count);
    }
    
}
