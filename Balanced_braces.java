import java.util.Scanner;
import java.util.Stack;

public class Balanced_braces {
    public static boolean isBalanced(String str)
    {
      Stack<Character> stack=new Stack<>();
      for(int i=0; i<str.length(); i++)
      {
          char c=str.charAt(i);
          if(c=='(' || c=='{' || c=='[')
          {
              stack.push(c);
              continue;
          }
          if(stack.isEmpty())
          {
              return  false;
          }
          char poppedChar=stack.pop();

          switch (c)
          {
              case ')':
                    if(poppedChar!='(') {
                        return false;
                    }
                    break;
              case '}':
                  if(poppedChar!='{') {
                      return false;
                  }
                  break;
              case ']':
                  if(poppedChar!='[') {
                      return false;
                  }
                  break;
          }
      }
      if(stack.isEmpty())
          return true;
      else
          return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expression=sc.next();
        System.out.println(isBalanced(expression));
    }
}
