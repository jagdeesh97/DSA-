import java.util.Scanner;
import  java.util.*;

public class Hashing_pair_sum {
    public  static int pair_sum(int arr[], int n, int target)
    {

        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
                return 1;
            else if(arr[i]+arr[j]<target)
                i++;
            else
                j++;
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int target=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            int ans=pair_sum(arr,n,target);
            if(ans==1)
                System.out.print("1");
            else
                System.out.print("0");
        }


    }
}
