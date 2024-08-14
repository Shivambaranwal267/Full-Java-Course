class grandfather{
    public void greet(){
        System.out.println("Hello from grandfather");
    }
}

class father extends grandfather{
    public void greet2(){
        System.out.println("Hello from father");
    }
}

class child1 extends father{
    public void msg(){
        System.out.println("Hello from child1");
    }
}

class child2 extends father{
    public void msg2(){
        System.out.println("Hello from child2");
    }
}


public class hybridin {
    public static void main(String[] args) {
        child1 obj1 = new child1();
        obj1.greet();
        obj1.greet2();
        obj1.msg();
         
        System.out.println();


        child2 obj2 = new child2();
        obj2.greet();
        obj2.greet2();
        obj2.msg2();
    }
}
