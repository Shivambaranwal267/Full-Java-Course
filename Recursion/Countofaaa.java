package Recursion;

import java.util.Scanner;

public class Countofaaa {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String st = scn.next();
    System.out.println(count1(st, 0, 0));
    System.out.println(count2(st, 0, 0));

    scn.close();
  }

  private static int count2(String st, int vidx, int count) {
    if (vidx >= st.length() - 2) {
      return count;
    }
    if (
      st.charAt(vidx) == 'a' &&
      st.charAt(vidx) == st.charAt(vidx + 1) &&
      st.charAt(vidx + 1) == st.charAt(vidx + 2)
    ) {
      int temp = count2(st, vidx + 3, count + 1);
      return temp;
    } else {
      int temp = count2(st, vidx + 1, count);
      return temp;
    }
  }

  private static int count1(String st, int vidx, int count) {
    if (vidx == st.length() - 2) {
      return count;
    }
    if (
      st.charAt(vidx) == 'a' &&
      st.charAt(vidx) == st.charAt(vidx + 1) &&
      st.charAt(vidx + 1) == st.charAt(vidx + 2)
    ) {
      int temp = count1(st, vidx + 1, count + 1);
      return temp;
    } else {
      int temp = count1(st, vidx + 1, count);
      return temp;
    }
  }
}
