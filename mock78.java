import java.util.Scanner;

public class mock78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];       // 1 2 3 4 5 6
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j]; // 1 4 7 8 8 n - k +1
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int i=n-1; i>=0; i--){
            if(arr[i-1]<arr[i])
            {
                count++;
            }
            if(count==k){
                System.out.print(arr[i]);
                return;
            }
        }

    }
}
