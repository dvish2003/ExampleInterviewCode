/*
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OutPutStream {
    public static void main(String[] args) {

        try{
            Cat cat = new Cat("Kapaya",3,"SheMale");
            File file = new File("Cat.txt");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);

            output.writeObject(cat);
            output.close();
            fileOutputStream.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
*/
