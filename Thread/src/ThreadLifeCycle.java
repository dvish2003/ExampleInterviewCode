//Thread life cycle
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try{
                Thread.sleep(1000); // Sleep for 1 second
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadLifeCycle {
    public static void main(String[] args) {

        //new State
        MyThread myThread = new MyThread();

        //Runnable state
        myThread.start();


        // Blocked state (simulating synchronization)
        synchronized (myThread) {
            try {
                myThread.wait(); // Waiting for notification
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Timed Waiting state
        Thread anotherThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        anotherThread.start();
        try {
            anotherThread.join(); // Wait for anotherThread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Terminated state
        System.out.println("Main thread is done");
    }
}
