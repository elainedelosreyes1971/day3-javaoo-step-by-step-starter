package ooss;

public class Student extends Person {

    private boolean isInClass = false;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a student.");
    }

    public String join(Klass klass) {
        if(klass != null){
            isInClass = true;
            return introduce().concat(" I am in class " + klass.getNumber() + ".");
        }
        return "";
    }

    public boolean isIn(Klass klass) {

        return isInClass;
    }
}
