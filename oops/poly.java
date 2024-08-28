import java.util.Scanner;

class add {
    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Integer : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second Integer : ");
        int num2 = sc.nextInt();

        System.out.println("Result is : " + num1 + num2);

    }
}

class sub extends add {
    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Integer : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second Integer : ");
        int num2 = sc.nextInt();

        System.out.println("Result is : " + (num1 - num2));
    }
}

class factorial extends add {
    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Integer : ");
        int num = sc.nextInt();

        int fact = 1;
        int i = 1;
        while (num > 0) {
            fact = fact * 1;
            i = i + 1;
        }
        System.out.println("factorial of " + num + "is" + fact);
    }
}

class square extends factorial {
    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer : ");
        int num = sc.nextInt();

        int res = num * num;
        System.out.println("Square of " + num + "is" + res);

    }
}

class triangle extends square {
    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();

        System.out.println("Enter breadth : ");
        int b = sc.nextInt();

        int area = l * b;

        System.out.println("Area of triangle : " + area);

    }
}

public class poly {
    public static void main(String[] args) {
        add obj1 = new add();
        obj1.method();

        sub obj2 = new sub();
        obj2.method();

        factorial obj3 = new factorial();
        obj3.method();

        square obj4 = new square();
        obj4.method();

        triangle obj5 = new triangle();
        obj5.method();

        System.out.println("Program Ends");

    }
}
