package practice03;

public class Student {
    private String name;
    private int age;
    private int Klass;

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        Klass = klass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return Klass;
    }

    public void setKlass(int klass) {
        Klass = klass;
    }

    String introduce()
    {
        return "I am a Student. I am at Class "+Klass+".";
    }
}
