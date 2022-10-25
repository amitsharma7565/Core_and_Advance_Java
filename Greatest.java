import java.util.Scanner;

class Greatest {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First number");
    int num1 = sc.nextInt();
    System.out.println("Enter the Second number");
    int num2 = sc.nextInt();
    if (num1 > num2) {
      System.out.println("First is greater");
    } else
      System.out.println("Second is greater");
  }
}