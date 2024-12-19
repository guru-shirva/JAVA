package pkg2;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        // Remove the start() here.
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Pjk12 {
    public static void main(String[] args) {
        System.out.println("Thread");
        MyThread t1 = new MyThread("ChildThread");
        t1.start();
    }
}
