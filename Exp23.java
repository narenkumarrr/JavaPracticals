class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println("Even" + i);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 0; i < 51; i++) {
            if (i % 2 != 0) {
                System.out.println("odd" + i);
            }
        }
    }
}

public class Exp23 {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}
