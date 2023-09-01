import java.util.Scanner;

//Problem Statement
//        Ram is a single boy in his village, everyone in his family are searching a bride for him and recommending
//        for Ram but Ram wants to Die Single, so for prevention of his marriage he came up a plan. He says that he will
//        marry that girl only If recommending member's name is a subsequence of girl name or girl's name is a subsequence
//        of recommending member. Don't worry Ram has a Huge Family. Your task is to determine wether Ram will Die Single
//        or will be married.
public class marry_me {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String str1;
        String str2;
        if(a.length()<b.length())
        {
           str1=a;
           str2=b;
        }
        else
        {
           str1=b;
           str2=a;
        }
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length())
        {
            if (str1.charAt(i)==str2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
              j++;
            }
        }
        if(i==str1.length())
        {
            System.out.print("Sadlife");
        }
        else
            System.out.print("DieSingle");

    }
}
