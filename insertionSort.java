import java.util.Scanner;

public class insertionSort {
    public static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++){ // starting from 2nd element
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key ){ // go back
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key; // fitting it into right position
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
