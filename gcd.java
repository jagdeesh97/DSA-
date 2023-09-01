import java.util.Scanner;

public class gcd {

    public static int find_gcd(int a, int b) {
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         System.out.print(find_gcd(a,b));
    }
}

//import java.util.*;
//class HelloWorld {
//    private static int findGcd(int a, int b) {
//        if(a == 0) return b;
//        if(b == 0) return a;
//        if(a == b) return a;
//
//        if(a > b){
//            return findGcd(a-b, b);
//        }
//        else{
//            return findGcd(a, b-a);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int gcd = findGcd(a,b);
//        System.out.print("GCD of "+a+" and "+b+ " is = "+gcd);
//    }
//}
