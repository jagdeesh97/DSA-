import java.util.Scanner;

public class linear_search {
    public static void linear_search(int arr[], int n, int target)
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]==target){
                System.out.print("Element found at index "+i);
                return;
            }
        }
        System.out.print("Element not found");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for( int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        linear_search(arr,n,target);
    }
}
