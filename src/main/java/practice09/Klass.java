package practice09;

public class Klass {
    private int number;
    private Student leader;


    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.getNumber();
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber()!=this.number){
                System.out.print("It is not one of us.");
        }
        this.leader = student;

    }

    public void appendMember(Student student) {
        student.setKlass(this);

    }
}
