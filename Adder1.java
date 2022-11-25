class Arithmetic{
  // function
      int add(int a, int b){
        int sum = a + b; 
        return sum;
}
}
 class Adder extends Arithmetic{
   
}
class Adder1{
    public static void main(String args[]){
        // Create a new Adder object
        Adder a = new Adder();
        // Print the  superclass on a new line
      System.out.println("My superclass is:- " + a.getClass().getSuperclass().getName());
      System.out.print(a.add(10,32));
}    
}