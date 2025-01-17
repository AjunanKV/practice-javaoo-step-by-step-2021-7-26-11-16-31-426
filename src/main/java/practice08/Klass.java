package practice08;

import java.util.LinkedList;

public class Klass {
    private int Klass;
    private Student leader;
   private LinkedList<Student> members;

    public Klass(int klass) {
        Klass = klass;
        members = new LinkedList<Student>();
    }

    public int getNumber() {
        return Klass;
    }
    public String getDisplayName() {

        return "Class "+Klass;
    }

    public void assignLeader(Student leader) {

        if(leader.getKlass().getNumber()!=this.Klass) { //5 - 2

            System.out.print("It is not one of us.\n");
        }
        else
            this.leader = leader;
    }
    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        if(member.getKlass().getNumber()==this.Klass)
        {
            members.add(member); //5
        }
    }



}
