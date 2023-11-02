import java.util.Scanner;
import java.util.Stack;

public class val_Parenthesis {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String st = sc.nextLine();
    System.out.println(val_parenthesisHelper(st));
    sc.close();
  }

  public static boolean val_parenthesisHelper(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (stack.isEmpty() || ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      } else {
        if (
          ch == ')' &&
          stack.peek() == '(' ||
          ch == ']' &&
          stack.peek() == '[' ||
          ch == '}' &&
          stack.peek() == '{'
        ) {
          stack.pop();
        } else {
          return false;
        }
      }
    }

    if (stack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
