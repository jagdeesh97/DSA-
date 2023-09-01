//Problem Statement
//        Given an array Arr[] of size N, your task is to count the number of triplets Arr[i], Arr[j] and Arr[k]
//        such that:-i < j < k and the difference between every 2 elements of triplets is less than or equal to P
//        i. e |Arr[i] - Arr[j]| <= P, |Arr[i] - Arr[k]| <= P and |Arr[j] - Arr[k]| <= P
import java.util.Scanner;
import java.util.*;
public class D_triplets_string {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int i=0;
        int j=2;
        int ans=0;
        while(j!=n)
        {
            if(i==j-1)
            {
                j++;
                continue;
            }
            if(arr[j]-arr[i]>p)
            {
                i++;
            }
            else
            {
              int x=j-i;
              ans+=x*(x-1)/2;
              j++;
            }
        }
        System.out.print(ans);
    }
}
