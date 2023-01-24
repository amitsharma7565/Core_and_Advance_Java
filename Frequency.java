/*5. Write a program a program to count the occurrence of each element in the array.
Expected Output:
---------------------------------------
 Element | Frequency
 ---------------------------------------
 1 | 2
 8 | 2
 3 | 2
 2 | 1
 5 | 3
 7 | 1
 9 | 1
 ----------------------------------------  
*/

import java.util.*;

public class Frequency {

	public static void main(String args[]) {
		int[] a = {1, 8, 3, 2, 5, 8, 1, 5, 5, 7, 9};
		HashMap<Integer, Integer> hm = new HashMap<>();

		// Count the occurrence of each element
		for (int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i]) + 1);
			} else {
				hm.put(a[i], 1);
			}
		}

		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println(" ---------------------------------------");
		
		// Print the frequency of each element
		for (int key : hm.keySet()) {
			System.out.println(" " + key + " | " + hm.get(key));
		}
		
		System.out.println(" ----------------------------------------");
	}
}