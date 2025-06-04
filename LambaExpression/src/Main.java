

interface MyFunction {
    void function(int a,int b);
}
public class Main {
    public static void main(String[] args) {

MyFunction myFunction = (x,y) ->{
    System.out.println(x+","+y);
};
myFunction.function(3,4);

    }
}