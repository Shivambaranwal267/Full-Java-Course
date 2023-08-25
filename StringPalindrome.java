import java.util.Scanner;

public class StringPalindrome {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String st = scn.nextLine();
    int n = st.length();

    char arr[] = new char[n];

    // converting to lowercase
    for (int i = 0; i < n; i++) {
      if ((st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')  ) {
        arr[i] = (char) (st.charAt(i) + 32);
      } else {  // uppercase
        arr[i] = st.charAt(i);
      }
    }
    // for (int i = 0; i < n; i++) {
    //   arr[i] = st.charAt(i);
    // }

    int s = 0;
    int e = n - 1;

    while (s < e) {
      if (arr[s] != arr[e]) {
        System.out.println("false");
        return;
      }
      s++;
      e--;
    }

    System.out.println("true");

    scn.close();
  }
}
