class HelloRecursion{
  public static void main(String args[]){
    
    p();
  }
  int count=0;
  public static void p(){
    count++;
    if(count<=5){
    System.out.println("Hello");
    p();
    }
   
  }
}