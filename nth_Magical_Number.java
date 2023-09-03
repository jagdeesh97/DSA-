import java.util.Scanner;

public class nth_Magical_Number {
    public  static  int nth_magical_No(int n, int a, int b){
        long lcm = lcm(a, b);
        long left = 0;
        long right = Long.MAX_VALUE;
        long mod = 1000000007;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long count = mid / a + mid / b - mid / lcm;

            if (count < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (int) (left % mod);
    }

    // Calculate the least common multiple (LCM) of two numbers
    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    // Calculate the greatest common divisor (GCD) of two numbers
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(nth_magical_No(n,a,b));
    }
}

//=============================================Statement======================================================
//    A positive integer is magical if it is divisible by either a or b.
//
//        Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large, return it modulo 109 + 7.
//
//
//
//        Example 1:
//
//        Input: n = 1, a = 2, b = 3
//        Output: 2
//        Example 2:
//
//        Input: n = 4, a = 2, b = 3
//        Output: 6
//
//
//        Constraints:
//
//        1 <= n <= 109
//        2 <= a, b <= 4 * 104