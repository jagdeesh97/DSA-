import java.util.*;

public class sort_character_by_freq_hashing {      //sort character in decreasing order by frequency
    public static void sortByFrequency(String str)   // input->  tree, output->eetr/eert
    {                                                 // input->acaacc , output->aaaccc
        int n = str.length();
        char[] s = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char i : s) list.add(i);     // adding character by character to list
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(str.charAt(i))) {
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), count + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        for (char i : list) System.out.print(i); // printing array list
        System.out.println();
        Comparator<Character> comp = (a, b) -> {
            int k1 = hm.get(a);
            int k2 = hm.get(b);
            if (k1 == k2) {
                return Character.compare(a, b);
            }
            return -Integer.compare(k1, k2);
        };
        Collections.sort(list, comp);

        for (char i : list) System.out.print(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sortByFrequency(str);
    }
}










