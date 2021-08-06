package practice09;

import java.util.LinkedList;

public class Klass {
    private int Klass;
//    private Student leader;
//    private LinkedList<Student> members;

    public Klass(int klass) {
        Klass = klass;
    }

    public int getNumber() {
        return Klass;
    }

    public String getDisplayName() {
        return "Class "+Klass;
    }

//    public void assignLeader(Student leader) {
//        this.leader = leader;
//        if(leader.getKlass().getNumber()!=this.Klass) {
//            System.out.println("It is not one of us.");
//        }
//        }
//
//    public Student getLeader() {
//        return leader;
//    }
//
//    public void appendMember(Student member) {
//        if(member.getKlass().getNumber()==this.Klass)
//        {
//            members.add(member);
//        }
//    }
}
