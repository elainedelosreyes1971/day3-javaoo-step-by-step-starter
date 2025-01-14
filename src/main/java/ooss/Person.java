package ooss;

import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
    public String getName() {
        return name;
    }

}
