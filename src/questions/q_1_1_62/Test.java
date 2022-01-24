package questions.q_1_1_62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String s = new String("Hello");

        List<String> values = new ArrayList<>();
        values.add(s);
        values.add(new String("Hello"));
        values.add(s);
        s.replace("l", "L");

        System.out.println(values);
    }
}
