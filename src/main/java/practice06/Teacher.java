package practice06;

import java.text.MessageFormat;
import java.util.Objects;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass!=null)
            return MessageFormat.format("{0} I am a Teacher. I teach Class {1}.",super.introduce(),klass.getNumber());
        else
            return MessageFormat.format("{0} I am a Teacher. I teach No Class.",super.introduce());
    }

    public String introduceWith(Student student) {
        return MessageFormat.format("{0} I am a Teacher. I {1}{2}.", super.introduce(),
                ((student.getKlass().getNumber()==klass.getNumber())?"teach ":"don't teach "),student.getName());
    }
}

