package practice09;

import java.text.MessageFormat;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
        @Override
        public boolean equals(Object person) {
            if (person instanceof Person) {
                return ((Person) person).getId() == this.getId();
            }
            return false;
        }
//    public String introduce() { return MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
//    }
    }

