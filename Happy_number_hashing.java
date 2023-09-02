import java.util.HashMap;
import java.util.Scanner;

public class Happy_number_hashing {
    static int changeNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (n != 1 && !hm.containsKey(n)) {
            hm.put(n, 1);
            n = changeNumber(n);
        }
        return n == 1; // return true if n == 1, otherwise return false
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isHappy(n));
    }
}
//============================== Altrnative ===========================
//
//static int changeNumber(int n) {
//    int sum = 0;
//    while (n > 0) {
//        int r = n % 10;
//        sum = sum + r * r;
//        n = n / 10;
//    }
//    return sum;
//}
//
//    public boolean isHappy(int n) {
//        int slow = n;
//        int fast = n;
//
//        do {
//            slow = changeNumber(slow);
//            fast = changeNumber(changeNumber(fast));
//
//            if (slow == 1 || fast == 1) {
//                return true;  // If either of them reaches 1, it's a happy number.
//            }
//        } while (slow != fast);
//
//        return false;  // If there's a cycle and neither of them reached 1, it's not a happy number.
//    }
