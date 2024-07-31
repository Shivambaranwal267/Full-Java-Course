import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            int n = sc.nextInt();
            int t = n;
            int i = 1, rev = 0;
            while (i <= n) {

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
        }

        else if (choice == 2) {
            int n = sc.nextInt();

            int t = n;
            int i = 1, res = 0;
            while (i <= n) {

                int lastdigit = n % 10;
                res = res + lastdigit * lastdigit * lastdigit;
                n = n / 10;

            }

            System.out.println("the result is " + res);
            if (t == res) {
                System.out.println("The number is a armstrong");
            } else {
                System.out.println("The number is not a armstrong");
            }

        }

        else if (choice == 3) {
            int n = sc.nextInt();
            int temp = n;

            int f, i;
            int sum = 0;
            while (n != 0) {
                f = 1;
                i = 1;
                int lastdigit = n % 10;
                while (i <= lastdigit) {
                    f = f * i;
                    i = i + 1;
                }

                n = n / 10;
                sum = sum + f;
            }

            System.out.println("The sum is " + sum);
            if (sum == temp) {
                System.out.println(" strong number");
            } else {
                System.out.println("not a strong number");
            }
        }

        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

}
