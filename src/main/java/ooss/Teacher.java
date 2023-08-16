package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private String teacherInfo = "";
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a teacher.").concat(teacherInfo);
    }

    public void assignTo(Klass klass) {
        if(klass != null){
            teacherInfo = "I teach class " + klass.getNumber();
        }
    }

    public boolean belongsTo(Klass klass) {

        return teacherInfo.contains("class " + klass.getNumber());
    }
}
