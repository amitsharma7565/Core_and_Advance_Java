// method overrind or Runtime Polymorphism

class Bank{
  float rateOfInterset(){
    return 0;
  }
}
class Sbi extends Bank {
  float rateOfInterset(){
    return 8.4f;
  }
}
class Hdfc extends Bank{
  float rateOfInterset(){
    return 8.5f;
  }
}
class Polymorphism1{
   public static void main(String args[]){
     Bank b;
     b=new Sbi();
     System.out.println(b.rateOfInterset());
     b=new Hdfc();
     System.out.println(b.rateOfInterset());
   }
 }