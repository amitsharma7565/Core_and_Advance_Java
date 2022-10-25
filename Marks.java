import java.util.*;

class Marks {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st Sub marks");
    int sub1 = sc.nextInt();
    System.out.println("Enter the 2nd Sub marks");
    int sub2 = sc.nextInt();
    System.out.println("Enter the 3rd Sub marks");
    int sub3 = sc.nextInt();
    System.out.println("Enter the 4th Sub marks");
    int sub4 = sc.nextInt();
    System.out.println("Enter the 5th Sub marks");
    int sub5 = sc.nextInt();
    int total = sub1 + sub2 + sub3 + sub4 + sub5;
    int per = (total * 100) / 500;
    System.out.println("Percentage is " + per + "%");
    if (per >= 90 && per <= 100) {
      System.out.println("Grade A");
    } else if (per >= 80 && per < 90) {
      System.out.println("Grade B");
    } else if (per >= 70 && per < 80) {
      System.out.println("Grade C");
    } else if (per >= 60 && per < 70) {
      System.out.println("Grade D");
    } else
      System.out.println("Fail");
  }
}
