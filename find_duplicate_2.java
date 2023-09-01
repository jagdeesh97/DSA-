import java.util.Arrays;
import java.util.Scanner;

public class find_duplicate_2 {
    public static void find_duplicate(int arr[], int n)
    {
      for(int i=0; i<n-1; i++)
      {
          if(arr[i]==arr[i+1])
              System.out.print(arr[i]+" ");
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        find_duplicate(arr,n);

    }
}
