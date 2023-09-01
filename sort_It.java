import java.util.Scanner;

public class sort_It {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();  // 2 2 0 1 0 0 1 1 2 0  only three digits are in input(0 , 1 , 2)
        }
        int j=0;
        int k=n-1;
        for(int i=0; i<n; i++)  // time complexity is O(n)
        {
           if(arr[i]==2)
           {
               int temp=arr[i];
               arr[i]=arr[k];
               arr[k]=temp;
               k--;
           }
           if(arr[i]==0)
           {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }

        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
