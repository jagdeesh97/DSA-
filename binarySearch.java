import java.util.Scanner;

public class binarySearch {
    public  static void binarySearch(int arr[],int l,int r,int target)
    {
        if (l<=r)
    {                //Stoppinng condition
        int middle = l + (r - l) / 2;
        if (arr[middle] == target) {
            System.out.print("Element found at index " + middle);
        }
       else if (arr[middle] > target)
        {
            binarySearch(arr, l, middle - 1, target);
        }
        else
        {
            binarySearch(arr, middle + 1, r, target);
        }
    }
        else
        {
           System.out.print("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        binarySearch(arr,0,n-1,target);
    }
}
