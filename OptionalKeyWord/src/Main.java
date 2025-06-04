import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tomku",8,"Female");
        Cat cat2 = null;

        Optional<Cat> optCat1 = Optional.ofNullable(cat1);
        Optional<Cat> optCat2 = Optional.ofNullable(cat2);

        optCat1.ifPresent(cat -> {
            System.out.println("Cat 1 Name: " + cat.getName());
            System.out.println("Cat 1 Age: " + cat.getAge());
        });

        optCat2.ifPresentOrElse(cat -> {
            System.out.println("Cat 2 Name: " + cat.getName());
            System.out.println("Cat 2 Age: " + cat.getAge());
        },()->System.out.println("Cat 2 is null"));


        Cat defaultCat = optCat2.orElse(new Cat("defaultCaaaat",8,"Female"));
        System.out.println(defaultCat.getName());
        System.out.println(defaultCat.getAge());

    }
}