package practice08;

public class Student {
    private String name;
    private int age;
    private Klass klass;
    private int id;

    public Student(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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

    public String introduce() {
        if (this.getKlass().getLeader() != null) {
            return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am Leader of Class " + this.getKlass().getNumber() + ".";

        }
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student. I am at Class " + this.getKlass().getNumber() + ".";
    }

}
