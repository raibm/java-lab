package questions.q_1_1_59;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {
        LocalDate obj = LocalDate.parse("1998-04-14");
        LocalTime localTime = LocalTime.MAX;

        System.out.println(obj.atTime(localTime));

    }
}
