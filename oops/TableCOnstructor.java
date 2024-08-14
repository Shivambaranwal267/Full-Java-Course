import java.util.Scanner;

class demo {
    int n;

    demo(int a) {
        n = a;
        int i = 1;
        while (i <= n) {
            System.out.println(n + " x " + i + " = " + n * i); // print the table
            i++;
        }

    }
}

public class TableCOnstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the number: ");
        int n = sc.nextInt();

        demo obj = new demo(n);

    }

}
