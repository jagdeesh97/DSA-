import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first_non_repeating_char_hashing {  // Print the index of first non repeating character
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(str.charAt(i)))
            {
               hm.put(str.charAt(i),-1);
            }
            else
            {
              hm.put(str.charAt(i),i);
            }
        }
        int val=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> x: hm.entrySet())
        {
           if(x.getValue() < val && x.getValue()!=-1)
               val=x.getValue();
//            if(x.getValue()>=0)
//                val=x.getValue();
        }
        if(val==Integer.MAX_VALUE)
            System.out.print("-1");
        else
            System.out.print(val);
//        if(val!=-1)
//            System.out.print(val);
//        else
//            System.out.print("-1");

    }
}
