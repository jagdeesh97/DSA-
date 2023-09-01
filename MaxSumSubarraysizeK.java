import java.util.Scanner;

public class MaxSumSubarraysizeK {
    public  static  int maxSumSubArraySizeK(int arr[], int n, int k)
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<=n-k; i++)      //Time complexity is O(n*k)
        {
            int sum=0;
            for(int j=0; j<k; j++)    // j=i; j<k+i; j++
            {
                sum +=arr[i+j];       // arr[j]
            }
            maxSum=Math.max(maxSum, sum);
        }
        return  maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSumSubArraySizeK(arr,n,k));
    }
}
