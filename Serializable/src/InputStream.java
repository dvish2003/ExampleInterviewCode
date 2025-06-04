import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class InputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("Employee.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);

            Employee em = (Employee) oin.readObject();
            System.out.println(em);


        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
    }
}
