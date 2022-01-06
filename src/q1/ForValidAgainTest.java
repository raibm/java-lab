package q1;

public class ForValidAgainTest {
    public static void chnage(TestClass1 testClass1) {
        testClass1 = new TestClass1();
        testClass1.msg = "Msg 2";
    }

    public static void main(String[] args) {
       TestClass1 t = new TestClass1();
       t.print();
       chnage(t);
       t.print();
    }
}
