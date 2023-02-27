public class Main {

    public static void main(String[] args) {
        Student maxStudent = new Student("Max", 21);
        System.out.println(maxStudent);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8,
                "Hannah");
        System.out.println(jimmy);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s child: " + super.toString();
    }
}
