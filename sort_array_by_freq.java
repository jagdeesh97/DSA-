import java.util.*;

public class sort_array_by_freq {
    ArrayList<Integer> list =new ArrayList<>();
   // for (Integer i : arr) list.add(i);
    public  static  void  sortByFrequency(int arr[], int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int count=hm.get(arr[i]);
                hm.put(arr[i],count+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        Comparator<Integer> cmp= (a,b) ->{
          int k1=hm.get(a);
          int k2= hm.get(b);
          if(k1==k2)
              return Integer.compare(a,b);
          else
              return -Integer.compare(a,b);
        };
       // Collections.sort(list,cmp);
      //  for (Integer i : list) System.out.print(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        sortByFrequency(arr,n);
    }
}
