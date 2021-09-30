import java.util.Set;

public class Test01 extends Parent {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Test01.class.getSuperclass().getName());
        System.out.println(Test01.class.getSuperclass().getSimpleName());
        System.out.println("Test01.main");
        Class<?> name = Class.forName(Test01.class.getSuperclass().getName());
        System.out.println(name.getTypeName());
        System.out.println("Test01.main");
        System.out.println(Test01.class.getSimpleName());

    }
}

class Parent {

}
