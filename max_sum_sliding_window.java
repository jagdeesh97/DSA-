import java.util.Scanner;

public class max_sum_sliding_window {
    public static int maxSumSubarrays(int arr[], int n, int k)  //find max sum among all Sub-arrays of size k in O(n*k) time complexity
    {
        int maxSum=Integer.MIN_VALUE;
        int sum;
        for(int i=0; i<=n-k; i++)
        {
            sum=0;
            for(int j=0; j<k; j++)  // or for(int j=i; j<i+k; j++)
            {
              sum = sum + arr[i+j];  // or sum=sum+arr[j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return  maxSum;
    }
    public  static  int maxSumSubarrays1SlidingWindow(int arr[], int n, int k) //find max sum among all Sub-arrays of size k in O(n) so complexity O(n)
    {
        int maxSum=0;
        for (int i=0; i<k; i++)
        {
            maxSum += arr[i];
        }
        int newSum=maxSum;
        for (int i=k; i<n; i++)
        {
            newSum = newSum + arr[i] -arr[i-k]; // arr[i-k]==first element of previous window
            maxSum=Math.max(maxSum,newSum);
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
        System.out.println(maxSumSubarrays(arr,n,k));

        System.out.println(maxSumSubarrays1SlidingWindow(arr,n,k));
    }
}
