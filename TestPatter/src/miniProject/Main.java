package miniProject;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student(1,"Rahul",21));
        service.addStudent(new Student(2,"Ankit",22));

        service.displayStudents();

    }

}
