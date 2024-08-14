class d {
    public void msg() {
        System.out.println("Hello World");
    }

    public void msg2() {
        System.out.println("Hello World ahkj");
    }
}

public class demo {
    public static void main(String[] args) {
        d obj = new d();
        obj.msg();
        obj.msg2(); // Accessing the msg() method of class d through obj object
    }
}
