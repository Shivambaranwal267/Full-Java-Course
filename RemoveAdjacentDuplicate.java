import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String st = sc.nextLine();

    System.out.println(RemoveadjacentduplicateHelper(st));
    sc.close();
  }

  public static String RemoveadjacentduplicateHelper(String s) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (st.size() == 0) {  // or(st.isEmoty())
        st.push(s.charAt(i));
      }
      else if (st.peek() == s.charAt(i)) {
        st.pop();
      } else {
        st.push(s.charAt(i));
      }
    }

    char[] ch = new char[st.size()];
    for (int i = ch.length - 1; i >= 0; i--) {
      ch[i] = st.pop();
    }

    return String.valueOf(ch);
  }
}
