class grandfather {
    void msg1() {
        System.out.println("Grandfather's Message");
    }
}

class son extends grandfather {
    void msg() {
        System.out.println("son's Message");
    }
}

class son2 extends grandfather {
    void msg() {
        System.out.println("son2's Message");
    }
}

public class hierarchi {
    public static void main(String[] args) {
        son obj1 = new son();
        obj1.msg1();
        obj1.msg();

        son2 obj2 = new son2();
        obj2.msg1();
        obj2.msg();

    }

}
