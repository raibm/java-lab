package questions.q_1_1_39;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args){
        Super s = new Sub();
        try {
            s.m1();
//        }catch (FileNotFoundException e){ não funciona, precisa do IoException
//            System.out.println("M");
        } catch (IOException e) {
            System.out.println("M");
        } finally {
            System.out.println("N");
        }
    }
}
