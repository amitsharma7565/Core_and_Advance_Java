import java.util.Scanner;
class Gst{
  public static void main(String args[]){
    Scanner s =new Scanner(System.in);
    int ac,gst,total;
    System.out.println("Enter the ac amount");
    ac=s.nextInt();
    System.out.println("Enter the gst%");
    gst=s.nextInt();
    total=ac+((ac*gst)/100);
    System.out.println("Total cost of ac is "+total);
  }
}