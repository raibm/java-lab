package questions.q_1_1_60;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
