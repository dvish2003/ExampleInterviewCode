public class RunnableThread implements Runnable{
    public void run() {
        System.out.println("Runnable thread");
    }

}

class test2{
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        Thread t1 = new Thread(rt);
        t1.start();
    }
}
