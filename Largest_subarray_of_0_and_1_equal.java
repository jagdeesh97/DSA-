import java.util.Scanner;

public class Largest_subarray_of_0_and_1_equal {
    public static void largest_subarray(int arr[], int n)
    {
        int sum=0;
        int maxSize=0;
        int startIndex=0;
        int endIndex=0;
        for(int i=0; i<n-1; i++)
        {
            sum=(arr[i]==0) ? -1:1;  // If element is zero make it -1
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]==0)
                    sum += -1;
                else
                    sum += 1;

                if(sum==0 && maxSize< j-i+1)
                {
                   maxSize=j-i+1;
                   startIndex=i;
                }
            }
        }
        endIndex=startIndex+maxSize-1;
        if(maxSize==-1)
            System.out.print("No such subarray is prisent");
        else
            System.out.print(startIndex +" to "+ endIndex);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        largest_subarray(arr,n);
    }
}
