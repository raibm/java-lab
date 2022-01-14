package questions.q_1_1_41;

public class BreakTest {
    public static void main(String[] args) {

        try {
            main(args);
        } catch (Exception ex){
            System.out.println("CATCH");
        }
        System.out.println("OUT");
    }
}
