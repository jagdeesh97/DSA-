import  java.util.*;
public class pattern_Diamond {
        public static void printDiamond(int n){
            for(int i=0;i<n;i++){   // 0 1 2
                for(int j=n-1;j>i;j--){     // 0 zeros
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int j=1;j<=2*i-1;j++){  // 0 spaces
                    System.out.print(" ");
                }
                if(i!=0){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=n-2;i>=0;i--){    // 2   // 2
                for(int j=n-1;j>i;j--){
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int j=1;j<=2*i-1;j++){
                    System.out.print(" ");
                }
                if(i!=0){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printDiamond(n);
        }
    }

