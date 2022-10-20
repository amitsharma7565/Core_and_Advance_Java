import java.util.Scanner;

class Event {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int brand, food, travel, logi, total;
    System.out.println("Enter the branding expenses");
    brand = s.nextInt();
    System.out.println("Enter the food expenses");
    food = s.nextInt();
    System.out.println("Enter the travel expenses");
    travel = s.nextInt();
    System.out.println("Enter the logistic expenses");
    logi = s.nextInt();
    total = brand + food + travel + logi;
    System.out.println("Total amount is " + total);
    int brandper =(brand*100) / total;
    int foodper = (food*100)/total;
    int travelper = (travel*100)/total;
    int logiper = (logi*100)/total;
    System.out.println("Perctange of Brand " + brandper + "%");
    System.out.println("Perctange of food " + foodper + "%");
    System.out.println("Perctange of travel " + travelper + "%");
    System.out.println("Perctange of logitics " + logiper + "%");
  }
}