
public class RevrseStringThatPlace {
  public static void main(String[] args) {
    String originalStr = "hi my name is amit";
    String words[] = originalStr.split(" ");
    String reversedString = "";
    for (int i = 0; i < words.length; i++){
      String word = words[i];
      // System.out.println(word);
      String reverseWord = "";
      for (int j = word.length() - 1; j >= 0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord;
    }
    System.out.print("Reversed string : " + reversedString);
  }
}