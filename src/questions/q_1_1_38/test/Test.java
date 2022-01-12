package questions.q_1_1_38.test;

import questions.q_1_1_38.*;

public class Test {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = (B)obj1; //classCastException

        obj2.print();
    }
}
