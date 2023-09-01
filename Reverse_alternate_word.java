import java.util.Scanner;

public class Reverse_alternate_word {
    public static String reverseWord(String str){  // input :  my name is rohit
        char ch;                                   // output : my eman is tihor
        String rev="";

        for(int i=0; i<str.length(); i++){
             ch = str.charAt(i);
             rev =ch + rev;
        }
        return  rev;
    }
    public static void main(String[] args) {   //Time and space Complexity O(n)
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String arr[] = sentence.split(" ");
        for(int i=0; i< arr.length; i++)
        {
            if(i%2==1){
               String rev_word= reverseWord(arr[i]);
                System.out.print(rev_word+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
