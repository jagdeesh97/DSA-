import java.util.HashMap;
import java.util.Scanner;

public class no_of_subarray_equal_0_1 {
    public static void Count_no_of_subarrays(int arr[], int n)
    {
     ;
        HashMap<Long,Integer> hm=new HashMap<>();   // n=7   1 0 0 1 0 1 1
        long sum=0L;
        long count=0L;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0) {
                arr[i] = -1;
            }

            sum=sum+arr[i];
            if(sum==0)
                count++;
            if(hm.containsKey(sum))
                count += hm.get(sum);
            if(!hm.containsKey(sum))
                hm.put(sum,1);
            else
                hm.put(sum, hm.get(sum)+1);
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Count_no_of_subarrays(arr,n);
    }
}
