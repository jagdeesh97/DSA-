import java.util.Scanner;

public class string_charArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch[]=str.toCharArray();   // string to character array
        for (int i=0; i<str.length(); i++)
        {
            System.out.print(ch[i]+" ");  // printing character array
        }

        System.out.println();
        String str1=String.valueOf(ch);  // character array to string
        System.out.println(str1);

        int n=1234;
        String str2=Integer.toString(n);
        System.out.println(str2);

      //  int i=String.
    }
}
