class Swap{
  public static void main(String args[]){
    int a=10;
    int b=20;

    System.out.println("a is "+a+" "+"b is "+b);
    
    int temp=a;//20
    a=b;
    b=temp;
     System.out.println("a is "+a+" "+"b is "+b);
  }
}