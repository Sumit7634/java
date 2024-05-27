public class QuickSort {
public static void main(String args [])
{
    int[] arr = {15,9,7,13,12,16,4,18,11};
    int length= arr.length;

    
}

void partition(int[] arr,int low, int high)
{
    int pivot =arr[(low+high)/2];
    while(low<=high)
    {
    while(arr[low]<pivot)
    {
        low++;
    }
    while(arr[high]>pivot)
    {
        high--;
    }
    if(low<=high)
    {
        
    }
}
}

}
