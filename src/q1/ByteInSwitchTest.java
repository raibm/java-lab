package q1;

public class ByteInSwitchTest {
    public static void main(String[] args){
        byte var = 100;

        switch (var){
            case 100:
                System.out.println("100");
                break;
            case 127:
                System.out.println("200");
        }
    }

}
