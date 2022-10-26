import java.util.Scanner;

class Prize {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    System.out.println("Enter the Third number");
    int num3 = sc.nextInt();
    int sum;
    sum = num1 + num2 + num3;
    if (sum == 180) {

      if (num1 == 90 || num2 == 90 || num3 == 90) {
        System.out.println("Prize 2");
      } else if (num1 == num2 && num2 == num3 && num3 == num1) {
        System.out.println("Prize 3");
      } else {
        System.out.println("Prize 1");
      }
    } else {
      System.out.println("No Prize");
    }
  }
}