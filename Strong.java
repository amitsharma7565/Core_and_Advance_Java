import java.util.*;

class Sample {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range");
    int n = sc.nextInt();// 145
    int rem, fact, sum = 0;
    int temp = n;
    while (n > 0) {
      rem = n % 10;// 5
      fact = 1;
      for (int i = 1; i <= rem; i++) {
        fact = fact * i;

      }
      System.out.println(fact);
      sum = sum + fact;
      n = n / 10;

    }
    System.out.println(sum);
    if (sum == temp) {
      System.out.println("strong number");
    } else {
      System.out.println("not strong number");
    }

  }
}