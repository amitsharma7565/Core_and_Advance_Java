/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA. DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
After printing gross salary display user defined message once object got garbage collected.
      Sample Input:
      Enter Basic salary: 23000
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/
import java.util.*;
public class GrossSalary {
  private int basic;
  private int da;
  private int hra;
// getter and setter
  public void setBasic(int basic){
    this.basic=basic;
  }
  public void setDa(int da){
    this.da=da;
  }
  public void setHra(int hra){
    this.hra=hra;
  }
  // getter
  public int getBasic(){
    return basic;
  }
  public int getDa(){
    return da;
  }
  public int getHra(){
    return hra;
  }
  // finilize
   public void finalize(){
    System.out.println("garbarge collected");
  }
    public static void main(String[] args) {
      GrossSalary gs = new GrossSalary();
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the basic Salary");
      int salary=sc.nextInt();
      int da= ((salary*82)/100);
      int hra=((salary*70)/100);
      System.out.println("Your gross salary is:"+(da+hra+salary));
      gs=null;
      System.gc();
    }
}
