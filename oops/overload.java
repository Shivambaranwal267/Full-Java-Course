import java.util.*;

class calculator {
    public int cal(int a, int b) {
        return a + b;
    }

    public int cal(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) * 100 / 500;
    }
}

public class overload {
    public static void main(String[] args) {
        calculator obj = new calculator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println("Enter d:");
        int d = sc.nextInt();
        System.out.println("Enter e:");
        int e = sc.nextInt();

        System.out.println("add: " + obj.cal(a, b));
        System.out.println("percentage is " + obj.cal(a, b, c, d, e) + "%");

        sc.close();

    }
}
