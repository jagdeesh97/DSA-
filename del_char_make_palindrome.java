import java.util.Scanner;

public class del_char_make_palindrome {
    public static  boolean checkPalindrome(String str){
        char ch;
        String str1="";
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            str1 = ch +str1;
        }
        if(str.equals(str1)){
            return  true;
        }else {
            return  false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        for(int i=0; i<s1.length(); i++){
            String s2=s1.substring(i);
            if(checkPalindrome(s2)){
                System.out.print("By removing character at index "+i+", string will be palindrome.");
                return;
            }
        }
        System.out.print("Not possible to make palindrome by removing one character from the string.");
    }
}
