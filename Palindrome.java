//import java.util.Scanner;
//
//public class Palindrome {
//     static boolean String Check_palindrome(String str,int s,int e){
//        if(s>=e){
//            return true;
//        }
//        if(str.charAt(s)!=str.charAt(e)){
//            return false;
//        }
//        else{
//            return Check_palindrome(str,s+1,e-1);
//        }
//    }
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String str=sc.next();
//     int s=str.charAt(0);
//     int e=str.charAt((str.length()-1));
//     System.out.println(Check_palindrome(str,s,e));
//    }
//}
