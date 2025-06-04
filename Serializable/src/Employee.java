import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String Name;
    private int Age;
    private transient String nic;  // serialize weddi serialize nowenn ona feilds kiynn use krnn transient  word ek(data walata protection ekak hmbenw)

    public Employee(String name, int age, String nic) {
        Name = name;
        Age = age;
        this.nic = nic;
    }

    public Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
