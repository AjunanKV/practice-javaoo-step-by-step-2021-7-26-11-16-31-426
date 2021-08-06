package practice09;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person{
    private LinkedList<Klass> klasses;
    public Teacher(int id, String name, int age, LinkedList<Klass> Klasses) {
        super(id, name, age);
        this.klasses =Klasses;
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }
}
