import java.util.Scanner;

public class find_Duplicates {
    public static void find_Duplicates(int arr[], int  n)  // time complexity O(n^2)
    {
        int x=Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i]<x)
                x=arr[i];
        }
        x=x-1;    // Used for flag only
           // 5 4 5 4 3 2 5 4
        for(int i=0; i<n; i++)
        {    boolean isMatched=false;
            if(arr[i]==x)    // To skip is already matched
                continue;;
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]==arr[j]) {
                    isMatched = true;
                    arr[j] = x;    // mark arr[j] to min
                }

            }
            if(isMatched)
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
        find_Duplicates(arr,n);
    }
}
