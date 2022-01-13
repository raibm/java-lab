package questions.q_1_1_39;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Super{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }

    @Override
    public void m2() throws FileNotFoundException{

    }

    @Override
    public void m3() throws ExceptionInInitializerError{

    }

    @Override
    public void m4() throws ClassCastException{

    }

}
