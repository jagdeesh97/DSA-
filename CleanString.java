import java.util.Scanner;

public class CleanString {
    public static void stringCleanIterative(String str) {  // aaabbbaabbccc  abbbb
        if(str.length()<2){
            System.out.print(str);
        }
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(i+1)) {
                System.out.print(str.charAt(i));
            }
            else {
                System.out.print("");
            }
        }
    }
//    public static String stringClean(String str){
//        if(str.length()<2){
//            return str;
//        }
//        if(str.charAt(0)==str.charAt(1)){
//            return stringClean(str.substring(1));
//        }
//        else{
//            return str.charAt(0)+stringClean(str.substring(1));vcfe32
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       // System.out.println(stringClean(str));
        stringCleanIterative(str);

    }
}
