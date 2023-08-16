package ooss;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<String> teacherClasses = new ArrayList<>();
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce().concat(" I am a teacher.");
        if(teacherClasses.isEmpty()){
            return introduction;
        }
        String classes = String.join(", ", teacherClasses);
        return introduction.concat(" I teach Class " + classes + ".");
    }

    public void assignTo(Klass klass) {
        if(klass != null) {
            teacherClasses.add(String.valueOf(klass.getNumber()));
        }
    }

    public boolean belongsTo(Klass klass) {

        return teacherClasses.contains(String.valueOf(klass.getNumber()));
    }

    public boolean isTeaching(Student student) {
        return teacherClasses.contains(Optional.ofNullable(student.getClassNumber()).orElse(0).toString());
    }

    public List<String> getTeacherClasses() {
        return teacherClasses;
    }
}
