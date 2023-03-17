import java.util.*;

public class RotateTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Array Size");
        int n = input.nextInt();
      System.out.println("Enter the array value");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
      System.out.println("How many values you want to shift");
        int m = input.nextInt();

        // Shift the array elements
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int j = (i - m + n) % n;
            b[j] = a[i];
        }

        // Print the shifted array
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}