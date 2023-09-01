import java.util.Scanner;
import  java.util.Arrays;
public class occurrence {
    public static void main(String[] args) {   ///fun(arr,element,occurrence)
                                                //fun(arr, 5, 2)   fun(arr,9,2
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                       // 1 4 5 7 9 6 6 2 4 4
        int element=sc.nextInt();
        int occ=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for( int i=0; i<n; i++)
        {
            if(arr[i]==element && occ>0){
                occ--;
                continue;
            }
            if(occ==0) {
                System.out.print(i-1);
                return;
            }

        }
    }
}
