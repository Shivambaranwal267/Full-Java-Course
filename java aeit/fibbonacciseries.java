import java.util.Scanner;

public class fibbonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a inetger");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            int nextNumber = a + b;
            
            nextNumber = n;

            System.out.print("\t" + nextNumber);
        }
    }
}
