import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OutPutStream {  //file ekak byte Stream krnne meken
    public static void main(String[] args) {
      try{
          Employee emp1 = new Employee("Vishan",12,"23232323");
          Employee emp2 = new Employee("Vish",122,"23232323");

          File file = new File("Employee.txt");

          FileOutputStream fos = new FileOutputStream(file);
          ObjectOutputStream oos = new ObjectOutputStream(fos);

          oos.writeObject(emp1);
          oos.writeObject(emp2);

          oos.close();
          fos.close();
      }catch (Exception e){
          System.out.println("Exception "+e.getMessage());
      }
    }
}
