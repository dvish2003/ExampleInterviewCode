import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int age;
    private transient String gender;

    public Cat(String name, int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Cat() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
