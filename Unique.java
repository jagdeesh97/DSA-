import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);   //5,9,12,11,32,45,9,77,5
        int n=sc.nextInt();
        int arr[]=new int[n];                // 5 9 12 11 32 35 9 77 5
        for(int i=0; i<n; i++)               // 5 5 9 9 11 12 32 35 77
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
            while (i<n-1 && arr[i]==arr[i+1])
            {
                i=i+1;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
