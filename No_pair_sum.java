import java.util.Arrays;
import java.util.Scanner;    //  Dsa -1 First question of mock-2(medium)

public class No_pair_sum {
    public static void pairsSum(int arr[], int n,int sum)
    {
      for(int i=0; i<n; i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(arr[i]+arr[j]==sum)
              {
                  System.out.print(" {"+arr[i]+","+arr[j]+"} ");
              }
          }
      }                                // 1 2 3 4 5 6 7 8 9 0
//        int i=0;
//        int j=n-1;
//        while(i<j){
//            if(arr[i]+arr[j]==sum){                             //n==20    sum = 21
//                System.out.print(" {"+arr[i]+" ,"+arr[j]+"} ");  //20 18 19 16 15 17 12 14 13 10 11 7 8 9 2 4 5 3 1 6
//                i++;
//                j--;}
//            else if(arr[i]+arr[j]<sum)
//                pairsSum(arr,i+1,j);
//            else
//                pairsSum(arr,i,j-1);
//        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        pairsSum(arr,n,k);
    }
}
