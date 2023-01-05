/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/

public class ArrayIndexOutOfBoundsException1 {

  public static void main(String args[]) {
    int a[] = { 2, 5, 9, 11, 15 };
    int a1[] = { 7, 21, 25, 29, 28, 32 };
    int a2[] = new int[5];
    int count;
    int i, j;
    System.out.println("prime numbers are");
    for (i = 0; i < a.length; i++) {
      count = 0;
      for (j = 1; j <= a[i]; j++) {
        if (a[i] % j == 0) {
          count++;
          a2[i] = a[i];
        }
      }
      if (count == 2) {
        System.out.println(a2[i]);
      }
    }

    for (i = 0; i < a1.length; i++) {
      count = 0;
      for (j = 1; j <= a1[i]; j++) {
        if (a1[i] % j == 0) {
          count++;
          a2[i] = a1[i];
        }
      }
      if (count == 2) {
        try {
          for (i = 0; i <= a2.length; i++) {
            System.out.println(a2[i]);
          }
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println("problem slove");

}
}
}
}