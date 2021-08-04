package practice07;

public class Klass {
    private int Klass;
    private Student leader;

    public Klass(int klass) {
        Klass = klass;
    }

    public int getNumber() {
        return Klass;
    }

    public String getDisplayName() {

        return "Class "+Klass;
    }



    public void assignLeader(Student Leader) {
        leader = Leader;
    }

    public Student getLeader() {
        return leader;
    }
}
