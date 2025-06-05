public class ExtendThread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }
}

class Test{
    public static void main(String[] args) {
        ExtendThread extendThread = new ExtendThread();
        extendThread.start();

    }
}

