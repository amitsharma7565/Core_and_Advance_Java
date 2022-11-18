class A{
  final int i=30;
  void amit(){
     System.out.println("Name is good ");
   }
 }
 class B extends A{
 
   void amit(){
     System.out.println("VArshda");
      // super call to the parent class 
    super.amit();

   }
   
 }

class Sample{
  public static void main(String args[]){
    A b=new A();
    b.amit();
    // System.out.pritnln(b.i);
  }
}
// final keyword

// public class Sample {
//   final int x = 10;

//   public static void main(String[] args) {
//     Sample myObj = new Sample();
//     myObj.x = 25; // will generate an error: cannot assign a value to a final variable
//     System.out.println(myObj.x);
//   }
// }