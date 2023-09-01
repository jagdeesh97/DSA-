import java.util.Arrays;
import java.util.Scanner;
import  java.util.Arrays;   // Find the median of two sorted array of different size

public class MedianOfSortedArray {
    public  static  double medianOfTwoSortedArray(int nums1[], int n, int nums2[], int m)
    {
        int merge[]=new int[n+m];
        System.arraycopy(nums1, 0, merge, 0,  n);
        System.arraycopy(nums2,0,merge,n, m);
        Arrays.sort(merge);

        int len=merge.length;
        if(len%2==0)
        {
            int mid1=merge[len/2];
            int mid2=merge[len/2 -1];
            return  (mid1+mid2)/2.0;
        }
        else
        {
            int mid=merge[len/2];
            return mid;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();;
        int nums1[]=new int[n];
        int nums2[]=new int[m];
        for(int i=0; i<n; i++)
        {
            nums1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++)
        {
            nums2[i]=sc.nextInt();
        }
        double ans=medianOfTwoSortedArray(nums1, n, nums2, m);
        System.out.print(ans);
    }
}
