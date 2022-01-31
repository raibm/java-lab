package questions.q_1_1_67;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> original = new ArrayList<Integer>();
        original.add(new Integer(2));
        original.add(new Integer(1));
        original.add(new Integer(0));

        original.remove(original.indexOf(0));


        System.out.println(original);

    }
}
