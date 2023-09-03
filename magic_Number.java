import java.util.Scanner;

public class magic_Number {
//    public  static boolean isMagic(int n){
//        while (n > 9) {
//            int sum = 0;
//            while (n > 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            n = sum;
//        }
//        return n == 1;
//    }

    public static boolean isMagic(int n){
        int sum = 0;
        while(n > 0 || sum > 9) {

            if(n == 0){
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return  (sum == 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isMagic(n));
    }

}


A number is said to be magic number if the sum of its digits are calculated till a single digit is obtained by repeadely adding the sum of its digits.
     If the single digits is comes to 1 then the number is magisc ortherwise not a magic .
return true or false in java
