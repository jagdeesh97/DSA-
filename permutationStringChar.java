import java.util.Scanner;

public class permutationStringChar {
    public static void permute(char strArr[],int left,int right ){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        char strArr[]=str.toCharArray();
        permute(strArr,0,strArr.length-1);
    }
}
