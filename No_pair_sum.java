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
//================================== Using HashMap ==================================================
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        // Create a HashMap to store elements and their frequencies
        Map<Integer, Integer> map = new HashMap<>();
        
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int complement = sum - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                int complementCount = map.get(complement);
                if (complement == arr[i]) {
                    // If the complement is the same as the current element, make sure there are at least 2 occurrences
                    if (complementCount >= 2) {
                        System.out.print("(" + arr[i] + " , " + arr[i] + ") , ");
                        flag = true;
                    }
                } else {
                    // Print the pair
                    System.out.print("(" + arr[i] + " , " + complement + ") , ");
                    flag = true;
                }
            }

            // Update the frequency of the current element in the map
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        if (!flag) {
            System.out.print("Pair is not exists");
        }
    }
}
