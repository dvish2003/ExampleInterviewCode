public class ReflactionObject {
    private final String name;
    private int age;

    public ReflactionObject(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){
        System.out.println("Meow");
    }
    private void heyThisIsPrivate(){
        System.out.println("how did you do this?  ");
    }
    public static void heyThisIsPublicStaticMethod(){
        System.out.println("how did you do this heyThisIsPublicStaticMethod?  ");
    }
    private static void heyThisIsPrivateStaticMethod(){
        System.out.println("how did you do this heyThisIsPrivateStaticMethod?  ");
    }
}
