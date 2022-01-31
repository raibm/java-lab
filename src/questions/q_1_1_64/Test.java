package questions.q_1_1_64;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> clone = (ArrayList<Counter>) original.clone();

        clone.get(0).count = 5;





        System.out.println(original);
    }
}
