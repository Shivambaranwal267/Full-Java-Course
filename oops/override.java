class clothes {

    String customer(String a) {
        return a;
    }
}

class customer2 extends clothes {
    String customer(String b) {
        return b;
    }
}

public class override {
    public static void main(String[] args) {
        clothes obj = new customer2();
        String m = obj.customer("shirt");
        String s = obj.customer("jeans");
        System.out.println("Customer replaces a: " + s);
    }
}
