import java.util.Scanner;
import java.util.Arrays;

public  class mock {
    public  static void swap(int arr[], int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int partition(int arr[], int l, int r)
    {
        int pivot=arr[r];
        int i=l-1;
        for(int j=l; j<=r-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
         swap(arr,i+1,r);
        return i+1;
    }
    public static void quick_Sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int p=partition(arr,l,r);
            quick_Sort(arr,l,p-1);
            quick_Sort(arr,p+1,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr,1,8);
        quick_Sort(arr,0,n-1);
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}