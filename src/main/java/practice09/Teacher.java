package practice09;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;
    public Teacher(int id, String name, int age, LinkedList<Klass> Klasses) {
        super(id, name, age);
        this.klasses =Klasses;
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }
    @Override
    public String introduce(){
        return klasses !=null?
                MessageFormat.format("{0} I am a Teacher. I teach Class {1}.",
                        super.introduce(),
                        klasses
                                .stream()
                                .map(klassValue-> String.valueOf(klassValue.getNumber()))
                                .collect(Collectors.joining(", "))):
                (super.introduce()+ " I am a Teacher. I teach No Class.");
    }
}
