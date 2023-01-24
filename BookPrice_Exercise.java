/*3. Given the price of n books, find the sum of the price of the Costliest k books. 
      The price of books is given in the form of an array. Use bubble sort algorithm for sorting. 
      Note that k is always less than n.
      Sample Input:-  n = 5 , arr =[3, 14, 54, 21, 41], k=2
      Expected Output:- The sum of k costliest book which can be brought is 95
*/

public class BookPrice_Exercise {
  static void bubbleSort(int a[]) // function to implement bubble sort
  {
    int n = a.length;
    int i, j, temp;
    for (i = 0; i < n; i++) {
      for (j = i + 1; j < n; j++) {
        if (a[j] < a[i]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static int costliest_books(int n, int[] arr, int k) {
    // Sort the array in non-decreasing order using bubble sort
    bubbleSort(arr);

    // Calculate the sum of the costliest k books
    int cost = 0;
    for (int i = n - k; i < n; i++) {
      cost += arr[i];
    }
    return cost;
  }

  public static void main(String[] args) {
    int n = 5;
    int[] arr = { 3, 14, 54, 21, 41 };
    int k = 2;
    System.out.println("The sum of k costliest book which can be brought is " + costliest_books(n, arr, k)); 
}
}