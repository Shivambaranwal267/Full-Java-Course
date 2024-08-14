import java.util.Scanner;

class entry {
    
    int a, b, c;
    
    void input() {
        System.out.println("Enter Two No.");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
  
    }
}

class Addition extends entry {
    void add() {
        int ans;
        super.input();
        ans = super.a + super.b;
        System.out.println("Sum=" + ans);
    }
}


public class basic {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add();
      

    }

}
