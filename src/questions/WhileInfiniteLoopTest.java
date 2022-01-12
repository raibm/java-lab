package questions;

public class WhileInfiniteLoopTest {
    public static void main(String[] args){
        int x = 1;
        while(check(x)){
            System.out.println(x);
        }
    }

    private static boolean check(int x){
        if( x < 5){
            x++;
            return true;
        }
        else {
            return false;
        }
    }
}
