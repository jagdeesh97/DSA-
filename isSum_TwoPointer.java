import java.util.Scanner;
                                   // APPLY ONLY SORTED ARRAY BECAUSE TWO POINTER WORKS ONLY SORTED ARRAY
public class isSum_TwoPointer {    // arr[i]+arr[j]==k
     public static void pair_Sum(int arr[], int n, int k){
         int i=0;
         int j=n-1;
         while (i<j){
                 if(arr[i]+arr[j]==k){
                     System.out.print(arr[i]+" "+arr[j]);
                     return;
                 }
                 else if(arr[i]+arr[j]<k){
                     i++;
                 }
                 else{
                     j--;
                 }
             }
             System.out.print("pair does't exist");
         }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        pair_Sum(arr,n,k);
    }
}
