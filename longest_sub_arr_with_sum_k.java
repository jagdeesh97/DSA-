import java.util.HashMap;
import java.util.Scanner;
                                // Length of lonngest subarray with given sum using hashmap
public class longest_sub_arr_with_sum_k {
    public static void findMaxLength_sum(int arr[], int n, int k)
    {

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int sum=0;
        int max_length=0;
        for(int i=0; i<n; i++)
        {
            sum +=arr[i];
            if(sum==k)
            {
                max_length=i+1;
            }
            if (!hm.containsKey(sum))
            {
                hm.put(sum, i);
            }
            if (hm.containsKey(sum - k))
            {
                int length=(i - hm.get(sum - k));
                max_length=Math.max(max_length, length);
            }

        }
        System.out.print(max_length);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        findMaxLength_sum(arr,n,k);
    }
}
