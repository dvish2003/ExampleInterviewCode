import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "../../Employee.txt";
try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
    String line;
    while ((line = bf.readLine()) != null) {
        System.out.println(line);
    }

}catch(Exception e) {
    System.out.println(e.getMessage());
}
}
}