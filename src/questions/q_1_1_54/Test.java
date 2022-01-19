package questions.q_1_1_54;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2020, 1, 1);
        LocalDate christimas = LocalDate.of(2020, 12, 25);

        boolean flag1 = newYear.isAfter(christimas);
        boolean flag2 = newYear.isBefore(christimas);

        System.out.println(flag1+":"+flag2);


    }
}
