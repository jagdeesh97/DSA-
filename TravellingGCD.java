//import java.io.*; // for handling input/output
//import java.util.*; // contains Collections framework
//
//// don't change the name of this class
//// you can add inner classes if needed
//class Main {
//    static int gcd(int a, int b){
//        if(b==0){
//            return a;
//            // }
//            // if(a==0){
//            //     return b;
//            // }
//            // while(a!=b){
//            //     if(a>b)
//            //       a=a-b;
//            //      else
//            //        b=b-a;
//            //} return a;
//            return gcd(b,a%b);
//        }
//        public static void main (String[] args) {
//            // Your code here
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int initial=sc.nextInt();
//            int a[] = new int[n];
//            for(int i=0; i<n; i++){
//                a[i]=sc.nextInt();
//            }
//            int b[] =new int[n];
//            for(int i=0; i<n; i++){
//                b[i]=Math.abs(a[i]-initial);
//                //  System.out.print(b[i]+" ");
//            }
//            int temp=gcd(b[0],b[1]);
//            for(int i=0; i<n-1; i++){
//                temp=gcd(temp,b[i+1]);
//                //System.out.println("hi");
//                System.out.println(temp);
//                // return;
//            }
//
//        }
//    }