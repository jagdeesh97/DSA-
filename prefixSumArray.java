import java.util.Scanner;

public class prefixSumArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int prefixsum[]=new int[n];
        prefixsum[0]=arr[0];
        for(int i=1; i<n; i++)
        {
            prefixsum[i]=arr[i]+prefixsum[i-1];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(prefixsum[i]+" ");
        }
    }
}
