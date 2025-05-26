import java.lang.reflect.*;

class Reflection{
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Test");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        Method m = cls.getDeclaredMethod("sayHello");
        m.invoke(obj);
    }
}

class Test {
    public void sayHello() {
        System.out.println("Hello from reflection");
    }
}
