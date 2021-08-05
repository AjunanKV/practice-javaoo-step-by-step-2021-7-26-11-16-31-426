package practice07;

import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }


    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String name=getName();
        return MessageFormat.format("{0} I am a Student. I am {1}{2}.",
                super.introduce(),
                ((klass.getLeader() != null && klass.getLeader().getName().equals(super.getName()))?"Leader of Class ":"at Class "),
                klass.getNumber());
    }
//    @Override
//    public String introduce() {
//        String name=getName();
//        if (klass.getLeader().getName()!= null && name.equals(klass.getLeader().getName()))
//        {
//            return MessageFormat.format("{0} I am a Student. I am Leader of {1}.", super.introduce(), klass.getDisplayName());
//        }
//        else
//            return MessageFormat.format("{0} I am a Student. I am at {1}.", super.introduce(), klass.getDisplayName());
//    }

}
