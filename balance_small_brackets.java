import java.util.Scanner;

public class balance_small_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='('){
                count++;
            }

            if(str.charAt(i)==')'){
                count--;
            }
            if(count<0)
            {
                System.out.println("Not balanced some opening braces is missing");
                return;
            }
        }
        if(count==0)
            System.out.println("Balanced ");
        else
            System.out.println("Not balanced some closing braces is missing");
    }
}
