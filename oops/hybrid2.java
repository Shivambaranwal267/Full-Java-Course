
interface grandfatgher {
    void gfvoice();
}

interface grandmother {
    void gmvoice();
}

class papa implements grandfatgher, grandmother {
    public void gfvoice() {
        System.out.println("Grandfather's voice");
    }

    public void gmvoice() {
        System.out.println("Grandmother's voice");
    }

    void pavoice() {
        System.out.println("Parent's voice");
    }
}

class son1 extends papa {
    void msg() {
        System.out.println("son1 voice");
    }
}

class son2 extends papa {
    void msg1() {
        System.out.println("son2 voice");
    }
}

public class hybrid2 {
    public static void main(String[] args) {
        son1 obj1 = new son1();

        obj1.gfvoice();
        obj1.gmvoice();
        obj1.pavoice();
        obj1.msg();

        son2 obj2 = new son2();
        obj2.gfvoice();
        obj2.gmvoice();
        obj2.pavoice();
        obj2.msg1();

    }
}
