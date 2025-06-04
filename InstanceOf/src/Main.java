class Parent {}
class Child extends Parent {}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent instanceof Child);
        System.out.println(child instanceof Parent);
        System.out.println(parent instanceof Object);
        System.out.println(child instanceof Object);
        ;

    }
}

// instance of eken wenne parent gen kawru hti pawatha enwd kiyl check krn ek