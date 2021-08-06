package practice09;

import java.util.LinkedList;

public class Klass {
    private int Klass;
    private Student leader;
   private LinkedList<Student> members;

    public Klass(int klass) {
        Klass = klass;
    }

    public int getNumber() {
        return Klass;
    }

    public String getDisplayName() {
        return "Class "+Klass;
    }

    public void assignLeader(Student leader) {
        if(leader.getKlass().getNumber()==this.Klass) {
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

      public void appendMember(Student member) {
        member.setKlass(this);
    }

    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }
}
