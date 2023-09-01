import java.util.Scanner;

public class reverse_array_Of_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch[]=sc.next().toCharArray();  // Enter a string
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]+" ");  // it will convert string to character
        }
        System.out.println("Reverse order of character is ....");
        int left=0;
        int right=ch.length-1;
        while (left<right)
        {
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}
