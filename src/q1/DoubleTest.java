package q1;

public class DoubleTest {
    public static void main(String[] args) {
        double price = 90000;
        String model;

        if(price > 100000){
            model = "Model X";
        } else if(price <= 100000){
            model = "Model Y";
        }
        int x = '7';
        cha(x);
        cha('5');
//        System.out.println(model); não pode receber null de parâmetro
    }

    public static void cha(char x){
        System.out.println(x);
    }
    public static void cha(int x){
        System.out.println(x);
    }
}
