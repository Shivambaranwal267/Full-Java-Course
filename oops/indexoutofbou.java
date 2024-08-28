public class indexoutofbou {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        try {
            int result = arr[3];
            System.out.println("result: " + result);
        } catch (Exception e) {
            System.out.println("Index out of bounds: " + e);
        }
    }
}
