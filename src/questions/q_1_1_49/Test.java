package questions.q_1_1_49;

public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);
        // é falso o_o
    }
}
