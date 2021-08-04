package practice04;

import java.text.MessageFormat;

public class Student extends Person {
    private int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    @Override
    public String introduce() {
        return  MessageFormat.format(super.introduce()+"Class {0}.",Klass);
    }
}
