import java.util.Scanner;

public class length_sum_zero1 {
    public static int longest_sum_zero_len(int arr[], int n)
    {

        int length=0;
        for(int i=0; i<n; i++)
        {  int sum=0;
            for(int j=i; j<n; j++) {
                sum += arr[j];

                if (sum == 0) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=longest_sum_zero_len(arr,n);
        System.out.print(ans);
    }
}
