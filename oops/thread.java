class ForRunnable implements Runnable{
   public void run() {
        System.out.println("This is a thread");
    }
}

public class thread {
    public static void main(String[] args) {
        ForRunnable r = new ForRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
