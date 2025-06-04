public class ShallowCopy {
    public static void main(String[] args) {

        Person originalPerson = new Person("Vishan",new Address("Kalutara"));

        Person shallowCopyPerson = new Person(originalPerson.getName(),originalPerson.getAddress());

        shallowCopyPerson.setName("John");
        shallowCopyPerson.getAddress().setCity("new york");

        System.out.println(originalPerson.getName()+"    "+originalPerson.getAddress().getCity());
        System.out.println(shallowCopyPerson.getName()+"    "+shallowCopyPerson.getAddress().getCity());

    }
}
