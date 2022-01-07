package q1;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student("James", 25);
        int marks = 25;
        review(student, marks);

        System.out.println(marks+" - "+student.marks);
    }

    private static void review(Student student, int marks){
        marks = marks + 10;
        student.marks += marks;
    }
}
