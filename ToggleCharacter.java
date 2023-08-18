import java.util.Scanner;

public class ToggleCharacter {

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   int n = sc.nextInt();

  //    // Consume the newline character left in the buffer
  //   sc.nextLine();

  //   char ch[] = new char[n];
  //   String st = sc.nextLine();

  //   for (int i = 0; i < n; i++) {
  //     ch[i] = st.charAt(i);
  //   }

  //   Toggle(ch);

  //   for(int i = 0; i< ch.length; i++) {
  //       System.out.print(ch[i]);
  //   }

  //   sc.close();
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();

    char[] ch = st.toCharArray(); // direct input we have method toCharArray
 
    Toggle(ch);

    for (int i = 0; i < ch.length; i++) {
      System.out.print(ch[i]);
    }

    sc.close();
  }

  public static void Toggle(char[] ch) {
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] >= 65 && ch[i] <= 90) { // uppercase
        ch[i] = (char) (ch[i] + 32);
      } else { // lowercase
        ch[i] = (char) (ch[i] - 32);
      }
    }
  }
}
