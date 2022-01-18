package questions.q_1_1_45;

public class Test {

    public static void main(String[] args) {
       String bankCode = "ICICINBBRT4";

       StringBuilder sb = new StringBuilder(bankCode);

       System.out.println(sb.equals(bankCode)+":"+bankCode.equals(sb));
    }
}
