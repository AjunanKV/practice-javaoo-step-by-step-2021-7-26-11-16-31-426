package practice08;

import java.text.MessageFormat;

public class Student extends Person{
    private practice08.Klass klass;


    public Student(int id, String name, int age, practice08.Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return MessageFormat.format("{0} I am a Student. I am {1}{2}.",
                super.introduce(),
                ((klass.getLeader() != null && klass.getLeader().getName().equals(super.getName()))?"Leader of Class ":"at Class "),
                klass.getNumber());
    }
}
