
public class excep {
    public static void main(String[] args) {
        int a = 5, b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed." + e);
        }
    }

}
