import java.util.*;
public class abs_diff_SumMax {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];     // n==10
        for(int i=0; i<n; i++)   //9 1 5 5 8 9 4 8 9 6
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //int A=arr[n-1];
        long ans=Integer.MIN_VALUE;   //6   //   1 1 5 5 8 9
        long sum;
        for(int i=0; i<n; i++)
        {     sum=0;
            for(int j=0; j<n; j++)
            {
                sum += Math.abs(arr[j]-arr[i]);
            }
            if(ans < sum)
            {
                ans=sum;
            }

        }
        System.out.print(ans);
    }
}
