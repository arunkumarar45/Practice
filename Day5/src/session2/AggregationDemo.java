package session2;
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String deptName;
    private Professor professor;   // Aggregation

    public Department(String deptName, Professor professor) {
        this.deptName = deptName;
        this.professor = professor;
    }

    public void showDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("Professor: " + professor.getName());
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        Professor p1 = new Professor("Dr. Sharma");  // Created outside

        Department d1 = new Department("Computer Science", p1);

        d1.showDetails();
    }
}