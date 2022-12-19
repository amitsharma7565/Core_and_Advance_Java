import java.util.*;

class Frequency {
  public void countEach() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your String :");
    String s1 = sc.nextLine();
    int count, count1, j = 0;
    char var = 'a';
    char var1 = 'A';
    char ch[] = s1.toCharArray();// array{a,b,c,g}
    while (j < 26)// a-z
    {
      count = 0;
      count1 = 0;
      for (int i = 0; i < s1.length(); i++) // length of string 1
      {
        if (var >= 'a' || var1 >= 'A') { // var>=a means a-z,
          if (ch[i] == var) // var zing
          {
            count++;
          } else if (ch[i] == var1) {
            count1++;
          }
        }

      }
      if (count > 0) {
        System.out.println("Frequency of " + var + " is " + count);
      }
      if (count1 > 0) {
        System.out.println("Frequency of " + var1 + " is " + count1);
      }
      var++;
      var1++;
      j++;
    }
  }

  public static void main(String a[]){
    FirstString fs=new FirstString();
    fs.countEach();
  }
}