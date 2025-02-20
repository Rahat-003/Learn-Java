package Reflection;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow () {
        System.out.println("Meow");
    }

    private void heyThisIsPrivate() {
        System.out.println("Private method called");
    }

    public static void thisIsAPublicStaticMethod() {
        System.out.println("Public static method called");
    }

    private static void thisIsAPrivateStaticMethod() {
        System.out.println("Private static method called");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
