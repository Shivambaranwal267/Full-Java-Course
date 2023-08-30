package Recursion;

import java.util.Scanner;

public class isPalindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();

    System.out.println(isPalin(st, 0, st.length() - 1));

    sc.close();
  }

  public static boolean isPalin(String st, int s, int e) {
    if (s == e || s >= e) {
      return true;
    }

    // if (s >= e) {
    //   return true;
    // }

    if (st.charAt(s) == st.charAt(e)) {
      boolean temp = isPalin(st, s + 1, e - 1);
      return temp;
    } else {
      return false;
    }
  }
}

// t.c is 0(n)
// s.c is 0(n)
