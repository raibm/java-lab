package q1;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);

        System.out.println(list); //da errooooo
    }
}
