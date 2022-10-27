import java.util.*;
class Qua{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    // b*b-4ac
    double a,b,c;
    System.out.println("Enter the A value");
    a=s.nextDouble();
    System.out.println("Enter the B value");
    b=s.nextDouble();
    System.out.println("Enter the C value");
    c=s.nextDouble();
     double res=(b*b)-(4*a*c);
    System.out.println(res);
  }
}