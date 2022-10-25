/*Write a JAVA program to input basiJAVAsalary of an employee and calculate its Gross     salary according to following: 

    BasiJAVASalary <= 10000 : HRA = 20%, DA = 80% 

    BasiJAVASalary <= 20000 : HRA = 25%, DA = 90% 

    BasiJAVASalary > 20000 : HRA = 30%, DA = 95%*/

import java.util.Scanner;

class Salary
{
 public static void main(String args[]) 
 {
   
  int basic_salary,GrossPayment;
//create an object using scanner class
  Scanner scan=new Scanner(System.in);

  System.out.println("Enter Basic Salary Of Employee: ");
  basic_salary=scan.nextInt();
 
   //condition
   if(basic_salary<=10000)            
{
  int da=(80*basic_salary)/100;
   int hra=(20*basic_salary)/100;
//formula for gross salry
  GrossPayment = basic_salary + da + hra;
   }
   else if(basic_salary<=20000)
   {
  int da = (90 * basic_salary) / 100;
  int hra = ( 25 * basic_salary) / 100;
  GrossPayment = basic_salary + da + hra;
   }
   else
   {
  int da = (95 * basic_salary) / 100;
  int hra = (30 * basic_salary) / 100;
  GrossPayment = basic_salary + da + hra;
   }

  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}