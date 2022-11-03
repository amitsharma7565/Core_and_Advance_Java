// prime number between 1 to n

import java.util.*;

class Prime2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int count;
    System.out.println("Enter range");
    int n = sc.nextInt();
     
    for (int i = 1; i <= n; i++) {
      count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println(i);
      }
    }
  }
}