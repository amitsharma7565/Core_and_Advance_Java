// Create a program that uses a HashMap to store data in key-value pairs, where the key is a string and the value is an integer. Allow the user to add, remove and update key-value pairs, and also display the entire map.
import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add key-value pair");
            System.out.println("2. Remove key-value pair");
            System.out.println("3. Update key-value pair");
            System.out.println("4. Display all key-value pairs");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = sc.nextLine();
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    map.put(key, value);
                    System.out.println("Key-value pair added.");
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("Key-value pair removed.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key: ");
                    key = sc.nextLine();
                    if (map.containsKey(key)) {
                        System.out.print("Enter new value: ");
                        value = sc.nextInt();
                        map.put(key, value);
                        System.out.println("Key-value pair updated.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 4:
                    System.out.println(map);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}