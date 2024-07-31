import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = n;
        int i = 1, rev = 0;
        while(i <= n) {

            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;

        }

        System.out.println("the reverse is " + rev);
        if (t == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

        sc.close();

    }

}
