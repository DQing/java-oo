package practice07;

public class Teacher {
    private String name;
    private int age;
    private Klass klass;

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

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        Klass klass = this.getKlass();
        if (klass != null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach Class " + this.getKlass().getNumber() + ".";
        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student) {
        int teacherNumber = this.getKlass().getNumber();
        int studentNumber = student.getKlass().getNumber();
        if (teacherNumber == studentNumber) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";

        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
