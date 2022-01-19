package questions.q_1_1_52;

public class Test {

    public static void main(String[] args) {
        Object[] objs = new Object[4];
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    objs[i] = new String("Java");
                    break;
                case 2:
                    objs[i] = new StringBuilder("Java");
                    break;
                case 3:
                    objs[i] = new SpecialString("Java");
                    break;
            }
        }

        for (Object ob : objs) {
            System.out.println(ob);
        }
    }
}
