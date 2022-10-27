
/*Write a JAVA program to input electricity unit charges and calculate total     electricity bill according to the given condition: 
    For first 50 units Rs. 0.50/unit 
    For next 100 units Rs. 0.75/unit 
    For next 100 units Rs. 1.20/unit 
     For unit above 250 Rs. 1.50/unit 
     An additional surcharge of 20% is added to the bill*/
//package
import java.util.*;

//create a main class
public class Electricity {
  // main method
  public static void main(String args[])
    {
        int units;
        double billtopay=0;
      //create an object by using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of units for calculating electricity bill:");
        units=sc.nextInt();
      //condition
        if(units<50)
        {
          //formula
            billtopay=units*0.50;
            
        }
        else if(units<150)  //145
        {
          //(50*0.5)+((145-100)*0.75) 25+33.75 58.75
            billtopay=(50*0.50)+((units-100)*0.75);
        }
        else if(units<250)
        {
            billtopay=(50*0.50)+(50*0.75)+((units-150)*1.20);
        }
        else
        {
            billtopay=(50*0.50)+(50*0.75)*((units-200)*1.50);
        }
        System.out.println("the electricity bill for"+units+" is: "+billtopay);