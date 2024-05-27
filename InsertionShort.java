public class InsertionShort {
    public static void main(String args[])
    {
        int[] a={2,4,6,1,3,5};
        int temp;
        int j;
        for(int i=1;i<a.length;i++)
        {
            temp =a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        System.out.println("The sorted array is as follows:");

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    
}
