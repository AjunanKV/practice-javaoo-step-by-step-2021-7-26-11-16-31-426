package practice03;

import java.text.MessageFormat;

public class Student extends Person{
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
    public String introduce()
    {
        return MessageFormat.format("I am a Student. I am at Class {0}.",Klass);
    }
}
