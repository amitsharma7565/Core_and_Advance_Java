class Avegen {
  // Function
  static String decodeString(String encodedText, int rows) {
 
    // Stores the length of the string
    int len = encodedText.length();
 
    // Stores the number of columns
    int cols = len / rows;
 
    // Declaring an empty string
    String res = "";
    for (int i = 0; i < cols; ++i)
    {
      for (int j = i; j < len; j += cols + 1)
      {
        // Adding the characters
        // into the empty string
        res += encodedText.charAt(j);
      }
    }
 
    // If their any space at the end,
    //  then delete 
    while (res.charAt(res.length() - 1) == ' ') {
      res = res.substring(0, res.length() - 2);
    }
    return res;
  }
 
  // main method 
  public static void main(String args[]) {
    String S = "GSRE   E  K   EFGS   KOE";
    int row = 4;
 
    System.out.println(decodeString(S, row));
 
  }
}