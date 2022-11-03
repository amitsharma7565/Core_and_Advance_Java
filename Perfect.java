import java.util.*;

class Perfect {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int i = 1, sum = 0;
    while (i <= n / 2) {
      if (n % i == 0) {
        sum = sum + i;
      }
      i++;
    }
    if (sum == n) {
      System.out.println("Perfect number");
    } else {
      System.out.println("Not perfect number");
    }

  }
}