import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringMock {  //2423.leetcode Remove Letter To Equalize Frequency
    public static  boolean equalCounts(int freq[] )
    {
        int c = 0;
        for (int i: freq)
        {
            if (i == 0)
            {
                continue;
            }
            else if (c == 0)
            {
                c = i;
            }
            else if (c == i)
            {
                continue;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  // aaabbbcccc
        String str=sc.next();
        int n=str.length();
        int freq[]=new int[26];
        for(int i=0; i<n; i++)
        {
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<n; i++)
        {
            char ch=str.charAt(i);
            freq[ch-'a']--;
            if(equalCounts(freq))
            {
                System.out.println("Ture");
                return;
            }
            freq[ch-'a']++;
        }
        System.out.println("False");
    }

}
