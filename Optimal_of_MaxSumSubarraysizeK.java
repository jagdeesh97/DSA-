import java.util.Scanner;

public class Optimal_of_MaxSumSubarraysizeK {  // Using sliding window
    public static int maxSumSubArraySizeK(int arr[], int  n , int k)    // Time complexity is O(n)
    {
      int maxSum=0;
      for(int i=0; i<k; i++)
      {
       maxSum = maxSum + arr[i];   // getting first window sum
      }

      int newSum = maxSum;
      for(int i=k; i<n; i++)
      {
          newSum = newSum + arr[i] - arr[i-k];
          maxSum = Math.max(maxSum, newSum);
      }
      return maxSum;
    }
    public static void main(String[] args) {   // input n=10 k=4
        Scanner sc=new Scanner(System.in);    // 1 2 7 3 4 1 9 15 1 0    output   29
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
