import java.util.Scanner;
import java.util.Stack;

public class mock79 {  //Write a code to check given string is Palindrome or not, using Stack
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        String str1="";
        for(int i=0; i<str.length(); i++){
            str1=str1+st.pop();
        }
        if(str.equals(str1)){
            System.out.print("String is Palindrome");
        }
        else{
            System.out.print("String  is not palindorme");
        }

    }

}
