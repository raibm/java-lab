package q1;

public class TestPenDriver {
    public static void main(String[] args) {
        OTG otg = new OTG(128, "UTF-8");
        System.out.println(otg.capacity + ":" + otg.type);
    }
}
