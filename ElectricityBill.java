/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/
import java.util.*;
public class ElectricityBill {

    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      try{
        System.out.println("Enter last month units:");
        int lmonth=Integer.parseInt(s.next());
        System.out.println("Enter this month units:");
        int pmonth=Integer.parseInt(s.next());
        int totunits=lmonth-pmonth;
        double bill=0;
        if(totunits<=50){
          bill=totunits*0.5;
        }
        else if(totunits<=150){
          bill=50*0.5+(totunits-50)*1.75;
        }
        else if(totunits<=250){
          bill=50*0.5+100*1.75+(totunits-150)*2.5;
        }
        else{
          bill=50*0.5+100*1.75+100*2.5+(totunits-250)*2.9;
        }
      bill=bill+0.1;
        System.out.println("surcharge bill:"+bill);
      }
       catch(Exception e){
        System.out.println(e);
}
}
}