// Create a class to print an integer and a character with two methods having the same name but different sequence of 
// the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/

class PrintIntChar{
  public void form(int n, char c){
    System.out.println("First"+n+" "+c);
  }
   public void form(char c, int n ){
    System.out.println("Second"+c+" "+n);
  }
}

class PolymorphismIntChar{
  public static void main(String args[]){
    PrintIntChar p=new PrintIntChar();
    p.form('k',10);
  }
}