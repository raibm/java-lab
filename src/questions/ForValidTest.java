package questions;

public class ForValidTest {
    public static void main(String[] args) {
        String[] arr = {"I", "N", "S", "E", "R", "T"};

        //funciona :(
//        for(int n = 0; n < arr.length; n += 1){
//            if(n % 2 == 0)
//                continue;
//            System.out.println(arr[n]);
//        }

        //funciona :D
//        for (int n = 0; n <= arr.length; n += 1) {
//            if (n % 2 == 0)
//                continue;
//            System.out.println(arr[n]);
//        }

        //funciona :D
//        for (int n = 1; n < arr.length; n += 2) {
//            if (n % 2 == 0)
//                continue;
//            System.out.println(arr[n]);
//        }

        for (int n = 1; n <= arr.length; n += 2) {
            if (n % 2 == 0)
                continue;
            System.out.println(arr[n]);
        }
    }
}
