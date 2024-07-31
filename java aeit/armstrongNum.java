import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int res = 0;

        while (temp > 0) {
            int r = temp % 10;
            res = res + r * r * r;
            temp = temp / 10;
        }

        if (n == res)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
        sc.close();
    }
}
