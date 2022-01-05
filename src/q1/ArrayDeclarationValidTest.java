package q1;

public class ArrayDeclarationValidTest {
    public static void main(String[] args) {
//        short arr [] = new short[2]; não funfa

        byte arr [] = new byte[10];

//        short arr[];
//        arr = new short[3];       funciona

//        short [2] arr; kkk n né

//        int arr [] = new int[]{100,100}; funciona pra popular, mas não tem indices o suficiente

//        int arr[] = new int[]{0, 0, 0, 0}; funciona o.o


        arr[1] = 5;
        arr[2] = 10;

        System.out.println(arr[1] + ", " + arr[2]);
    }
}
