// 1st level
/*
class Display{ // share resource
    void print(){
        for (int i = 0; i < 5; i++) {
            try{
                ThreadMy.sleep(1000);
                System.out.println("Hello World");
            }catch (Exception e){
                System.out.println("Exception"+e.getMessage());
            }
        }
    }
}

class ThreadMy extends Thread{

    Display obj;
    public ThreadMy(Display obj) {
        this.obj = obj;

    }

    public void run() {
        obj.print();
    }
}

public class Synconization {
    public static void main(String[] args) {
        Display obj = new Display();
        ThreadMy thread = new ThreadMy(obj);
        thread.start();
    }


}
*/


//2nd level

/*
class Display{ // share resource
    void print(){

        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            try{
                ThreadMy.sleep(1000);
                System.out.println(t.getName());
            }catch (Exception e){
                System.out.println("Exception"+e.getMessage());
            }
        }
    }
}

class ThreadMy extends Thread{

    Display obj;
    public ThreadMy(Display obj) {
        this.obj = obj;

    }

    public void run() {
        obj.print();
    }
}

public class Synconization {
    public static void main(String[] args) {
        Display obj = new Display();
        ThreadMy thread = new ThreadMy(obj);
        ThreadMy thread2 = new ThreadMy(obj);
        thread.start();
        thread2.start();

        //mehidi wenne thread 2k ek para run weddi maruwen maruwata print wei
  */
/*out put

Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
Thread-0
Thread-1
*//*


*/
/*
        System.out.println(Thread.currentThread().getName());  // main method is thread
*//*


    }


}
*/




/*
//3rd level  use Synconize
class Display{ // share resource
    synchronized void print(){
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            try{
                ThreadMy.sleep(1000);
                System.out.println(t.getName());
            }catch (Exception e){
                System.out.println("Exception"+e.getMessage());
            }
        }
    }
}

class ThreadMy extends Thread{

    Display obj;
    public ThreadMy(Display obj) {
        this.obj = obj;

    }

    public void run() {
        obj.print();
    }
}

public class Synconization {
    public static void main(String[] args) {
        Display obj = new Display();
        ThreadMy thread = new ThreadMy(obj);
        ThreadMy thread2 = new ThreadMy(obj);
        thread.start();
        thread2.start();

        */
// mehidi synconize keyword ek use kirimen ek thred ekak run u pasu anika run wei
/*out put

Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1


    }


}
*/


//4th level use synconize block
class Display{ // share resource
    void print(){
        Thread thread = Thread.currentThread();

        synchronized (this){
            for (int i = 0; i < 5; i++) {
                try{
                    ThreadMy.sleep(1000);
                    System.out.println(thread.getName());

                }catch (Exception e){
                    System.out.println("Exception"+e.getMessage());
                }
            }
        }

    }
}

class ThreadMy extends Thread{

    Display obj;
    public ThreadMy(Display obj) {
        this.obj = obj;

    }

    public void run() {
        obj.print();
    }
}

public class Synconization {
    public static void main(String[] args) {
        Display obj = new Display();
        ThreadMy thread = new ThreadMy(obj);
        ThreadMy thread2 = new ThreadMy(obj);
        thread.start();
        thread2.start();
    }


}



