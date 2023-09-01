import java.util.Scanner;

public class test_binary {
    public static void binary(int arr[], int l, int r,int target)
    {
        if(l<=r)
        {
            int m=l+(r-l)/2;
            if(arr[m]==target){
                System.out.print("Element present");
            }
            else if(arr[m]>target){
                binary(arr,l,m-1,target);
            }
            else {
                binary(arr,m+1,r,target);
            }
        }
        else
        {
          System.out.print("Not present");
        }

    }
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        binary(arr,0,n-1,target);
    }
}
