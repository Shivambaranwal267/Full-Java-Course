class add {
    int a, b;

    public int method() {
        return a + b;
    }
}

class subtract extends add {

    public int method() {
        return a - b;
    }
}

public class polymor {
    public static void main(String[] args) {
        add obj = new add();
        obj.a = 5;
        obj.b = 3;
        System.out.println("add is: " + obj.method());

        subtract obj2 = new subtract();
        obj2.a = 10;
        obj2.b = 5;
        System.out.println("sub is: " + obj2.method());

    }
}