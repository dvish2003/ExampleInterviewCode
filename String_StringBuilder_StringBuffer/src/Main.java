public class Main {
    public static void main(String[] args) {
        String string = "Hello World 1";
        System.out.println(string);

        StringBuilder builder = new StringBuilder("Hello World 2");
        builder.append("Hello Ijse 122");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer("Hello World 3");
        buffer.append("Hello Ijse 223");
        System.out.println(buffer);
    }
}