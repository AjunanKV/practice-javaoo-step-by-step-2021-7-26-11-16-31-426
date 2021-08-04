package practice05;

import java.text.MessageFormat;

public class Teacher extends Person {
    private int Klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, int klass) {
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
        String prefix = super.introduce()+" I am a Teacher. ";
        if(Klass!=0)
            return MessageFormat.format("{0}I teach Class {1}.",prefix,Klass);
        else
            return  MessageFormat.format("{0}I teach No Class.",prefix);

    }

}
