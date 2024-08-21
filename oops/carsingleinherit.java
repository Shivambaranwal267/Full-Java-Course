import java.util.*;

class user {
   

    void car() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter car model: ");
        String model = sc.nextLine();

        System.out.println("Enter seats 4 or 7: ");
        int seat = sc.nextInt();

    }

}

class print extends user {
    void msg(){
       super.car();
       
    }
}

public class carsingleinherit {
    public static void main(String[] args) {
      
    }
}
