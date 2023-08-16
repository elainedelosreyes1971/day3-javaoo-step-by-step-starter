package ooss;

public class Student extends Person {

    private String classInfo = "";

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a student.").concat(this.classInfo);
    }

    public void join(Klass klass) {
        if(klass != null){
            classInfo = " I am in class " + klass.getNumber() + ".";
        }
    }

    public boolean isIn(Klass klass) {

        return classInfo.contains("class " + klass.getNumber());
    }
}
