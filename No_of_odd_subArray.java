import java.util.Scanner;

public class No_of_odd_subArray {
    public static void oddSubArrays(int arr[], int n)
    {   int count=0;
        int product;
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                product=1;
                for(int k=i; k<=j; k++)
                {
                    product *=arr[k];   // To print subarray write SOP(arr[j]+" ");
                }
                if(product%2!=0){       // To print subarary wtite SOPln()
                    count++;
                }
            }
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
        oddSubArrays(arr,n);
    }

}
