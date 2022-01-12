package questions;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args){
        LocalTime time = LocalTime.of(16, 40);
//        String amPm = time.getHour() >= 12 ? (time.getHour() == 12 ) ? "AM" : "PM"; compilation error

    }
}
