package questions;

import java.util.ArrayList;
import java.util.List;

public class BreakTest {
    public static void main(String[] args) {
        String arr[] = {"Rai", "Ana", "Pedro", "Luna"};
        List<String> names = new ArrayList<>();
        for (int x = 0; x < arr.length; x++) {
            names.add(arr[0]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }

        System.out.println(names.size());
    }
}
