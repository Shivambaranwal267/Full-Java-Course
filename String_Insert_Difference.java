// import java.util.*;

// public class String_Insert_Difference {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String st = sc.nextLine();

//     char ch[] = st.toCharArray();

//     System.out.println(ASCII_difference(ch));
//   }

//   public static String ASCII_difference(char ch[]) {
//     int diff = 0;
//     String res = "";
//     for (int i = 0; i < ch.length; i++) {
//       diff = ch[i + 1] - ch[i];
//       res = res + diff;
//     }

//     return String.valueOf(res);
//   }
// // }

// import java.util.Scanner;

// public class String_Insert_Difference {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input: ");
//         String input = sc.nextLine();

//         StringBuilder st = new StringBuilder();

//         for (int i = 0; i < input.length(); i++) {
//             st.append(input.charAt(i));

//             if (i < input.length() - 1) {
//                 int diff = input.charAt(i + 1) - input.charAt(i);
//                 st.append(diff);
//             }
//         }

//         System.out.println("Output: " + st.toString());
//         sc.close();
//     }
// }

import java.util.Scanner;

public class String_Insert_Difference {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();

    int n = st.length();
    String ans = "";
    for (int i = 0; i < n - 1; i++) {
      char ch = st.charAt(i);
      ans = ans + ch;
      int temp = st.charAt(i + 1) - st.charAt(i);
      ans = ans + temp;
    }

    ans = ans + st.charAt(n- 1);
    System.out.println(ans);

    sc.close();
  }
}
