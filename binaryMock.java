import java.util.Scanner;

public class binaryMock {
    public  static void  binarySearchIndex(int arr[], int l, int r, int target) {   // 6 8
                                                                                    //  1 2 3 8 8 9

        if(l<=r)
        {
            int m = l+ (r-l)/2;

            if(arr[m] == target) {
                System.out.print("Element found at index " +m);
                return;
            }
            else if(arr[m] > target){
                binarySearchIndex(arr,l,m-1,target);
            }
            else{
                binarySearchIndex(arr,m+1,r,target);
            }

        }
        else{
            System.out.print("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        binarySearchIndex(arr,0,n-1,target);
    }
}
