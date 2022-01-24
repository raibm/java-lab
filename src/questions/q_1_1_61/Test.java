package questions.q_1_1_61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Wubalufu");
        students.add("Animalus");
        students.add("Artorias");
        students.add("Deporati");

        Iterator<String> stringIterator = students.iterator();

        while (stringIterator.hasNext()) {
            String student = stringIterator.next();
            if (student.startsWith("A")) {
                students.remove(student);
            }
        }

        System.out.println(students);
    }
}
