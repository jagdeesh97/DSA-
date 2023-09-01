import java.util.Scanner;

public class no_of_unique_character {
    public static void no_of_unique_character_brute(String str)
    {
        int n=str.length();                // newton school //newtoschl  //jagdesh
        int count=0;
        for(int i=0; i<n; i++)
        {   boolean unique=true;
            for(int j=i+1; j<n; j++)
            {
               if(str.charAt(i)==str.charAt(j))
                   unique=false;
                  break;
            }
            if(unique)
                count++;
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        no_of_unique_character_brute(str);
    }
}
//    String str=sc.nextLine();      // Efficient approach using hashSet
//    HashSet<Character> hs=new HashSet<Character>();
//
//        for(int i=0; i<str.length(); i++)
//        {
//        hs.add(str.charAt(i));
//        }
//        System.out.print(hs.size());