import java.util.Scanner;

public class StringEvenFirstOddLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the message to encrypt: ");
        String message = input.next();

        String evenChars = "";
        String oddChars = "";

        for (int i = 0; i < message.length(); i++) {
            if (i % 2 == 0) {
                evenChars = evenChars+message.charAt(i);
            } else {
                oddChars = oddChars+message.charAt(i);
            }
        }

        String encryptedMessage = evenChars + oddChars;
        System.out.println("Encrypted message: " + encryptedMessage);

        input.close();
    }
}