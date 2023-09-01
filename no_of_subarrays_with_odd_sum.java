import java.util.Scanner;

public class no_of_subarrays_with_odd_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
           if(arr[i]%2==1)
                count++;
        }
        System.out.println(count);
       int  contSum=0;
       int  finalSum=Integer.MIN_VALUE;
       for(int j=0;j<n;j++)
       {
           for(int i=0; i<n; i++)
           {
               contSum=arr[j]+contSum;
               if(contSum%2==1)
                   count++;
           }
       }

        System.out.print(count);

    }
}
