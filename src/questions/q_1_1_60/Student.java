package questions.q_1_1_60;

public class Student {

    private String name;
    private int age;

    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return ""+age + "|"+name;
    }
}
