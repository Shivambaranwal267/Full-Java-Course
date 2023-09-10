import java.util.Scanner;
import java.util.Stack;

// input --> (){}[)  --> false
// input --> [()[]{}]{} --> true

public class ValidParenthesis {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println(IsValid(str));
    sc.close();
  }

  public static boolean IsValid(String s) {
    Stack<Character> st = new Stack<>();


    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (st.isEmpty() || ch == '(' || ch == '[' || ch == '{') {
        st.push(ch);
      } else {
        if (
          (ch == ')' && st.peek() == '(') ||
          (ch == ']' && st.peek() == '[') ||
          (ch == '}' && st.peek() == '{')
        ) {
          st.pop();
        } else {
          return false;
        }
      }
    } 

    if (st.isEmpty()) {  // or u write  (st.size()== 0)
      return true;
    } else {
      return false;
    }
  }
}


// public static boolean IsValid(String s) {
//       Stack<Character> st = new Stack<>();

//       for (int i = 0; i < s.length(); i++) {
//         if (st.size() == 0) {
//           st.push(s.charAt(i));
//         } else if (
//           (s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')
//         ) {
//           st.push(s.charAt(i));
//         } else {
//           if (s.charAt(i) == ')') {
//             if (st.peek() == '(') {
//               st.pop();
//             } else {
//               return false;
//             }
//           } else if (s.charAt(i) == ']') {
//             if (st.peek() == '[') {
//               st.pop();
//             } else {
//               return false;
//             }
//           } else { //  (s.charAt(i) == ')')
//             if (st.peek() == '}') {
//               st.pop();
//             } else {
//               return false;
//             }
//           }
//         }
//       }

//       if (st.size() == 0) {
//         return true;
//       } else {
//         return false;
//       }
//     }
//   }