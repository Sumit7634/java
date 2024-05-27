import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the Array:");
        int j= sc.nextInt();
        String[] d;
        d= new String[j];
        for(int i=0;i<=j-1;i++)
        {
            System.out.println("Enter the element of the string");
            d[i]= sc.next();
            
        }
        for(int i=0;i<=j-1;i++)
        {
            System.out.print(d[i]+",");
        }
        System.out.println();
        int[] a;
        a=new int[j];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        for(int i=0;i<=2;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("This is the next output");


        int[] b= new int[j];
        {
            for(int k=0;k<=j-1;k++)
            {
                b[k]=k*10;
            }
            for(int i=0;i<=j-1;i++)
            {
                System.out.print(" "+ b[i]+",");
            }
        }

        System.out.println("This is the next output");


        int[] c={45,65,75,95,105};

        for(int i=0;i<=j-1;i++)
        {
            System.out.print(c[i]+",");
        }
        System.out.println("This is the next output");




    }
    
}
