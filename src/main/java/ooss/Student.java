package ooss;

import java.util.Optional;

public class Student extends Person {

    private Integer classNumber = null;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce().concat(" I am a student.");
        if(classNumber != null){
            return introduction.concat(" I am in class " + classNumber + ".");
        }
        return introduction;
    }

    public void join(Klass klass) {
        if(klass != null){
            classNumber = klass.getNumber();
        }
    }

    public boolean isIn(Klass klass) {

        return klass.getNumber() == Optional.ofNullable(classNumber).orElse(0);
    }

    public Integer getClassNumber() {
        return classNumber;
    }
}
