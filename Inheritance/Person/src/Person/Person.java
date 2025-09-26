package Person;

public class Person {
    protected String name;
    protected int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }
}
