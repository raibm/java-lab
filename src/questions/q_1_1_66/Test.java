package questions.q_1_1_66;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Character> original = new ArrayList<>();
        original.add(0, 'V');
        original.add('T');
        original.add(1,'E');
        original.add(3, 'O');

        if(original.contains('O')){
            original.remove('O');
        }

        for(char ch: original){
            System.out.println(ch);
        }
    }
}
