import java.util.Scanner;

class Salary {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the basic Salary");
    int basic = x.nextInt();
    int hra = (basic * 12) / 100;
    int da = (basic * 20) / 100;
    int gross = basic + hra + da;
    System.out.println("The total salary is" + gross);
  }
}