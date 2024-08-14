
import java.util.Scanner;

class demo {
    public void add() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is :" + (a + b));
    }

    public void sub() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sub is :" + (a - b));

    }

    public void divide() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Divide is :" + (a / b));

    }

    public void multiply() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("multiply is :" + (a * b));

    }

    public void evenorodd() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {
                System.out.println("even Number");
            } else {
                System.out.println("odd Number");
            }
        }
    }

    public void primeNum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime num");
        } else {
            System.out.println("not Prime num");
        }

    }

    public void grade() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enflish marks: ");
        double English = sc.nextDouble();

        System.out.print("Enter hindi marks: ");
        double hindi = sc.nextDouble();

        System.out.print("Enter hindi marks: ");
        double Marathi = sc.nextDouble();

        double Total = English + hindi + Marathi;

        System.out.println("Total marks is " + Total);
        double percentage = Total * 100 / 300;

        System.out.println("Total percentage is " + percentage + "%");

        if (percentage < 95 && percentage > 85) {
            System.out.println("Grade A");
        }
        if (percentage < 85 && percentage > 75) {
            System.out.println("Grade B");
        }
        if (percentage < 75 && percentage > 65) {
            System.out.println("Grade C");
        }

    }

}

public class obj {

    public static void main(String[] args) {
        demo obj = new demo();

        obj.add();
        obj.sub();
        obj.divide();
        obj.multiply();
        obj.evenorodd();
        obj.primeNum();
        obj.grade();

    }
}
