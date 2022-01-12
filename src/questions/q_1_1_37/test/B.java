package questions.q_1_1_37.test;

import questions.q_1_1_37.A;

class B extends A {
    public String name;
    protected String lastName;

    public void print(){
        A obj = new A();
        System.out.println(obj.name);
//        System.out.println(obj.lastName); n funfa
        System.out.println(this.lastName);
        System.out.println(super.lastName);
    }

    public static void main(String[] args){

    }
}

