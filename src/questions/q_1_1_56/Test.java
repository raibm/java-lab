package questions.q_1_1_56;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(dateTimeFormatter.format(localDate.minus(period)));

    }
}
