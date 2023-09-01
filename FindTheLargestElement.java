import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        Arrays.sort(arr);
        int largest = arr[0];
        for( int i=1; i<n; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.print(largest);

       // System.out.println(arr[n-1]);
    }
}
