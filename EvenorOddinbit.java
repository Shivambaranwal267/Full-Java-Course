import java.util.Scanner;

public class EvenorOddinbit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // Print the binary representation of the input number
    System.out.println("Binary representation: " + Integer.toBinaryString(n));

    // The bitwise AND operator (&) returns 1 if the two bits are both 1, and 0 otherwise.
    // So, n & 1 will be 0 if the least significant bit of n is 0, and 1 if the least significant bit of n is 1.
    if ((n & 1) == 0) {
      System.out.println(n + " is even number");
    } else {
      System.out.println(n + " is Odd Number");
    }

    sc.close(); 
  }
}
