import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflactionTutorial {
    public static void main(String[] args) {
try{

    ReflactionObject myCat = new ReflactionObject("Stella",9);

    System.out.println("/*============================== Access Private Variable =======================================================================================================================================*/");

    //before edit name
    System.out.println(myCat.getName());

    Field[] fields = myCat.getClass().getDeclaredFields();


    //use reflaction and edit name
    for (Field field : fields) {
        if (field.getName().equals("name")) {
            field.setAccessible(true);
            field.set(myCat,"Wagabon");

        }
    }

    System.out.println(myCat.getName());


    System.out.println("/*=============================== Access Private method ======================================================================================================================================*/");

    Method[] catMethod = myCat.getClass().getDeclaredMethods();
    for (Method method : catMethod) {
        if (method.getName().equals("heyThisIsPrivate")) {
            method.setAccessible(true);
            method.invoke(myCat);
        }
    }

    System.out.println("/*=============================== Access Private heyThisIsPublicStaticMethod ======================================================================================================================================*/");

    Method[] catMethod2 = myCat.getClass().getDeclaredMethods();
    for (Method method : catMethod2) {
        if (method.getName().equals("heyThisIsPublicStaticMethod")) {
            method.setAccessible(true);
            method.invoke(null);
        }
    }




}catch (Exception e){
    System.out.println(e.getMessage());
}
    }
}