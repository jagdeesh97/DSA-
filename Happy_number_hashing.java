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


The time complexity of the code is O(k), where 'k' is the number of iterations it takes to determine whether 'n'
    is a happy number or not. In most cases, 'k' is relatively small, as the algorithm converges to 1 quickly for 
    happy numbers. However, in the worst case scenario, where 'n' is not a happy number, 'k' could be relatively large.

The space complexity of the code is O(k), where 'k' is the number of iterations. This is because the code uses a HashMap 
    to store previously seen numbers, and in the worst case, it might need to store 'k' different numbers before detecting
    a cycle or reaching 1. Therefore, the space complexity is proportional to the number of iterations required to determine
    whether 'n' is a happy number or not.
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

 //================================= Happy number in JavaScript ================================================
    let n = prompt("Enter a number: ");

if (isHappy(Number(n))) {
    console.log("Number is a happy number");
} else {
    console.log("Number is not a happy number");
}

function isHappy(n) {
    let hm = {}; // Use an object as a hashmap

    while (n !== 1 && !hm[n]) {
        hm[n] = 1;
        n = changeNumber(n);
    }

    return n === 1;
}

function changeNumber(num) {
    let sum = 0;

    while (num > 0) {
        let r = num % 10;
        sum += r * r;
        num = Math.floor(num / 10); // Corrected the division
    }

    return sum;
}

//        } while (slow != fast);
//
//        return false;  // If there's a cycle and neither of them reached 1, it's not a happy number.
//    }
