class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    private int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        Student student = new Student("Thando", 12345);

        student.displayName();
        student.displayStudent();
    }
}
