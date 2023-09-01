import java.util.Scanner;
                           //IT WORKS BOTH SORTED AND UNSORTED ARRAY
public class isSum_Exist {
    public static void pair_Sum(int arr[], int n, int k){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==k){
                    System.out.print(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
        System.out.print("Pairs does not exist");
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
