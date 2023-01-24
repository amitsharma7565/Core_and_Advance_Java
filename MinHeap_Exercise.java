/*1. Write a program to accept n values into an array, and  write a code to build a min-heap of that array.
      Sample Input:- n=7, arr =[ 3, 13, 7, 16, 21, 12, 9]
      Expected Output:- 
      Parent : 3 Left : 13 Right :7
      Parent : 13 Left : 16 Right :21
      Parent : 7 Left : 12 Right :9
*/

import java.util.*;

public class MinHeap_Exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values for the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] minHeap = buildMinHeap(arr, n);

        for (int i = 0; i < n / 2; i++) {
            System.out.println("Parent : " + minHeap[i] + " Left : " + minHeap[2 * i + 1] + " Right : " + minHeap[2 * i + 2]);
        }
    }

    public static int[] buildMinHeap(int[] arr, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
        return arr;
    }

    public static void minHeapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(arr, n, smallest);
}
}
}