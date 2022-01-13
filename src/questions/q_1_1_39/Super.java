package questions.q_1_1_39;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Super {
    public abstract void m1() throws IOException;

    public abstract void m2() throws FileNotFoundException;
    public abstract void m3() throws ExceptionInInitializerError;
    public abstract void m4() throws ClassCastException;
}
