import java.util.Scanner;

public class ReverseString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    System.out.println(Reverse(str));


    sc.close();
  }

  public static String Reverse(String str) {
    int n = str.length();
    char[] ch = str.toCharArray();

    int start = 0;
    int end = n - 1;

    while (start < end) {
      char temp = ch[start];
      ch[start] = ch[end];
      ch[end] = (temp);
      start++;
      end--;
    }
    // String temp = "";
    String ans = String.valueOf(ch);
    return ans;

    // return new String(ch);
  }
}
