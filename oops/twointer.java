
interface abc {
    void msg();
}

interface xyz {
    void msg2();
}

class mno implements abc ,xyz {
    public void msg() {
        System.out.println("This is msg");
    }

    public void msg2() {
        System.out.println("This is msg2");
    }
}

public class twointer {
    public static void main(String[] args) {
         mno obj = new mno();
         obj.msg();
         obj.msg2();
    }

}