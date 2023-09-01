//import java.util.HashMap;
//import java.util.Scanner;
//
//public class equalZeroandOne {
//    public static void countsubarray(int arr[], int n)
//    {
//        for(int i=0; i<n; i++)
//        {
//            if(arr[i]==0) {
//                arr[i] = -1;
//            }
//        }
//        long ans=0L;
//        long sum=0L;
//        HashMap<Long,Integer> hm=new HashMap<>();
//        for(int i=0; i<n; i++)
//        {
//            sum +=arr[i];
//            if(sum==0){  //Starting from index 0 subarray
//                ans++;
//            }
//            if(hm.containsKey(sum)){  //In between subarray
//              int freq= hm.get(sum);
//              ans += freq;
//              hm.put(sum,freq+1);
//            }
//            else{
//                hm.put(sum,1);
//            }
//        }
//        System.out.print(ans);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new arr[n];
//        for(int i=0; i<n; i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        countsubarray(arr,n);
//
//    }
//}
