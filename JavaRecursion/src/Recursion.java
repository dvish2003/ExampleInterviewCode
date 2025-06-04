public class Recursion {
    int i = 0;
    public void display(){
       i++;
       if(i<10){
           System.out.println("Display");
           display();
       }
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.display();
    }
}


// recursion is method call it self