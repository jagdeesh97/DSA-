import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int first_largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        if(n<2){
            System.out.print("Invalid input");
            return;
        }
        for(int i=0; i<n; i++){

            if(first_largest<arr[i]){
                second_largest=first_largest;
                first_largest=arr[i];
            }
            if(second_largest<arr[i] && arr[i]!=first_largest){
                second_largest=arr[i];
            }
//
//            if (second_largest == Integer.MIN_VALUE)
//                System.out.print("There is no second largest" + " element\n");
//            else
//                System.out.print(second_largest);
        }
        System.out.print(second_largest);
    }
}
