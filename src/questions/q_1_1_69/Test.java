package questions.q_1_1_69;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        String []  arr = {"A", "ab", "bab", "Aa", "bb", "baBa", "aba", "Abab"};
        Predicate<String> predicate = e -> e.toUpperCase().substring(0,1).equals("A");
        proccess(arr, predicate);
    }

    private static void proccess(String[] arr, Predicate<String> predicate){
        for(String a : arr){
            if(predicate.test(a)){
                System.out.println(a);
            }
        }
    }
}
