package ooss;

import java.util.Objects;
import java.util.Optional;

public class Klass {

    private final int number;
    private String leader = "";
    private String personName = "";
    private String personType = "";

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }



    public int getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if(Optional.ofNullable(student.getClassNumber()).orElse(0) == this.number){
            leader = student.getName();
            System.out.println("I am " + personName + personType + number + ". I know " + leader + " become Leader.");
        } else {
            System.out.println("It is not one of us.");
        }

    }

    public boolean isLeader(Student student) {
        return student.getName().equals(leader);
    }

    public void attach(Teacher teacher) {
        if(teacher.getTeacherClasses().contains(String.valueOf(number))){
            personName = teacher.getName();
            personType = ", teacher of Class ";
        }
    }

    public void attach(Student student) {
        if(Optional.ofNullable(student.getClassNumber()).orElse(0) == number){
            personName = student.getName();
            personType = ", student of Class ";
        }
    }
}
