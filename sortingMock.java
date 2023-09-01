import java.util.Scanner;

public class sortingMock {
    public static void main(String[] args) {    // 4 8 6 2 4 7 9 2
        Scanner sc=new Scanner(System.in);     //  j i
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j=i-1;
            while( j >= 0 && arr[j] > key){
                 arr[j+1] = arr[j];
                 j--;
            }
            arr[j+1] = key;
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
//import java.util.Scanner;
//
//public class sortingMock {
//    public  static  void insertionSorting( int arr[]){
//        int n=arr.length;
//        for(int i=1; i<n; i++) {
//            int key = arr[i];
//            int j=i-1;
//            while( j >= 0 && arr[j] > key){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
//        }
//
//        for(int i=0; i<n; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {    // 4 8 6 2 4 7 9 2
//        Scanner sc=new Scanner(System.in);     //  j i
//        int n=sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0; i<n; i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//      insertionSorting(arr);
//
//    }
//}
