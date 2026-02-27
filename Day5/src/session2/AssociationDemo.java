package session2;
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println(name + " teaches " + student.getName());
    }
}

public class AssociationDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Arun");
        Teacher t1 = new Teacher("Rahul Sir");

        t1.teach(s1);   // Association
    }
}