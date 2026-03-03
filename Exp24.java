class ThreadA extends Thread {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

}

class ThreadB extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println(ch);
        }
    }
}

public class Exp24 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
    }
}
