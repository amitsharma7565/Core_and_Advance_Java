
/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/
import java.util.Scanner;


class Sport {

  // Create a member variable for Sport name
  private String Sportname;

  public Sport(String Sportname) {
    this.Sportname = Sportname;
  }

  // Set member variable for Sport name
  public void setSportname(String newvalue) {
    Sportname = newvalue;
  }

  public String getSportname() {
    return Sportname;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Sport name");
    String str = sc.nextLine();
    // Create object for Sport class
    Sport obj = new Sport(str);
    System.out.println("Sport name: " + obj.getSportname());
    // Print the value of Sport name using "this" reference
  }
}