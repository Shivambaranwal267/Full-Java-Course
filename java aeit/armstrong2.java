import java.util.Scanner;

public class armstrong2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = n;
        int i = 1, res = 0;
        while(i <= n) {

            int lastdigit = n % 10;
            res = res + lastdigit * lastdigit * lastdigit ;
            n = n / 10;

        }

        System.out.println("the result is " + res);
        if (t == res) {
            System.out.println("The number is a armstrong");
        } else {
            System.out.println("The number is not a armstrong");
        }

        sc.close();

    }

}
