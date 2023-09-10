import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentelement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    // input--> adabbacaacded

    System.out.println(RemoveAdjacentduplicate(str));
    sc.close();
  }

  public static String RemoveAdjacentduplicate(String s) {
    Stack<Character> st = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (st.size() == 0) {   // if stack is empty
        st.push(s.charAt(i));
        // continue;
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
