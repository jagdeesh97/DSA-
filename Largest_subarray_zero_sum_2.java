import java.util.HashMap;
import java.util.Scanner;

public class Largest_subarray_zero_sum_2 {
    public static int longest_sum_zero(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0; i<n; i++)
        {
            sum +=arr[i];
            if(arr[i]==0 && length==0)
                return 1;
            if(sum==0)
                return i+1;
            Integer pre_i=map.get(sum);

            if(pre_i!=null)
                length=Math.max(length,i-pre_i);
            else
                map.put(sum,i);
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print(longest_sum_zero(arr,n));
    }
}
