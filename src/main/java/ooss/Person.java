package ooss;

public class Person {

    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am "+ age +" years old.";
    }
}
