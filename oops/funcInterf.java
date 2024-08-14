import java.util.*;

interface abc {
    public void input();

    public void fact();
}

class xyz implements abc {
    Scanner scanner = new Scanner(System.in);
    int n, f = 1;

    public void input() {
        System.out.println("Enter a No.: ");
        n = scanner.nextInt();

    }

    public void fact() {
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("factorial is " + f);
    }

}

public class funcInterf {
    public static void main(String[] args) {
         xyz obj = new xyz();
         obj.input();
         obj.fact();
    }
}
