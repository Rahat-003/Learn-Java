package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Reflection in java");

        Cat myCat = new Cat("Shopi", 2);

        Field[] catFields = myCat.getClass().getDeclaredFields();
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Field field : catFields) {
//            System.out.println(field.getName());
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "billu");
            }
        }

//        System.out.println(myCat.getName());

        for (Method method : catMethods) {
//            System.out.println(method.getName());
//            if (method.getName().equals("heyThisIsPrivate")) {
//                method.setAccessible(true);
//                method.invoke(myCat);
//            }
            if (method.getName().equals("thisIsAPublicStaticMethod")) {
                method.invoke(null);
            }
            if (method.getName().equals("thisIsAPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }
        }


    }
}
