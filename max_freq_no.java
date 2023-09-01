import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;    // Dsa-1 Third question of mock-2(medium)

public class max_freq_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        //{1 6 4 2 7 4 2 3 9 2 8 4}
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int freq=hm.get(arr[i]);
                hm.put(arr[i],freq+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
//        int max=Integer.MIN_VALUE;
//        for(Map.Entry<Integer,Integer> element:hm.entrySet())
//        {
//            if(element.getValue()>max)
//            {
//                max=element.getKey();
//            }
//        }
//        System.out.print(max);
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> x : hm.entrySet())
        {
            if (max_count < x.getValue())
            {
                res = x.getKey();
                max_count = x.getValue();
            }
        }

        System.out.print(res);
    }
}
