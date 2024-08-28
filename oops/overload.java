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
         a = obj.cal(50, 50);
        System.out.println("Add: " + a);
        double b = obj.cal(50, 50, 10, 20, 30);
        System.out.println("Percentage: " + b + "%");

    }
}
