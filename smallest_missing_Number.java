import java.util.Scanner;

public class smallest_missing_Number {   //input == 1 2 3 4 5 6    output== 0  Complexity is O( log(n) )
    public  static  int smallestMissingNumber(int arr[], int l, int r)// input== 0 1 2 3 4 5 6 8 9 10
    {                                                                 // output==  7
        if(l>r){
            return l;
        }
        int mid=l+(r-l)/2;
        if(mid==arr[mid])
        {
            return smallestMissingNumber(arr,mid+1,r);
        }
        else
        {
            return smallestMissingNumber(arr,l,mid-1);
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
        System.out.println(smallestMissingNumber(arr,0,n-1));
    }
}
