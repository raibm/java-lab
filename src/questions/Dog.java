package questions;

class Dog extends Animal{
   private String breed;

//   Dog(String b){
//       breed = n;   precisa referenciar o construtor pai
//   }

   Dog(String b, String n){
       super(n);
       breed = b;
   }
}

