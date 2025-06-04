public class DeepCopy {
    public static void main(String[] args) {
        Person originalPerson = new Person("Vishan",new Address("Kalutara"));

        Person deepCopyPerson = new Person(originalPerson.getName(),new Address(originalPerson.getAddress().getCity()));

        deepCopyPerson.setName("John");
        deepCopyPerson.setAddress(new Address("New York"));

        System.out.println(originalPerson.getName()+"    "+originalPerson.getAddress().getCity());
        System.out.println(deepCopyPerson.getName()+"    "+deepCopyPerson.getAddress().getCity());
    }
}
