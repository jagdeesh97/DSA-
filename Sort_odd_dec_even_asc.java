import java.util.Arrays;
import java.util.Scanner;

public class Sort_odd_dec_even_asc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int odd[]=new int[n];
        int even[]=new int[n];
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==1){
                odd[i]=arr[i];
            }
            else {
                even[i]=arr[i];
            }
        }
        int l=odd.length;
        Arrays.sort(odd);
        for(int i=0; i<l; i++) {
            System.out.print(odd[i] +" ");
        }
        Arrays.sort(even);
        for(int i=n; i>l; i--)
        {
            even[i]=even[i];
        }
        for(int i=n; i>l; i--) {
            System.out.print(even[i] +" ");
        }
    }
}
