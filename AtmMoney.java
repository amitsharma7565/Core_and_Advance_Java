import java.util.*;
class AtmMoney{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("welcome to sbi Atm");
    System.out.println("Enter the Amount");
    int amount= sc.nextInt();
    int num_notes_500=0;
    int num_notes_200=0;
    int num_notes_100=0;
    if(amount>=100 && amount <=10000){
      if(amount%100==0){
        while (amount > 0) {
                if (amount >= 500) {
                    num_notes_500 += amount / 500;
                    amount %= 500;
                } else if (amount >= 200) {
                    num_notes_200 += amount / 200;
                    amount %= 200;
                } else {
                    num_notes_100 += amount / 100;
                    amount %= 100;
                }
            }
        int total_notes = num_notes_500 + num_notes_200 + num_notes_100;
         System.out.println(total_notes);
          }
      
        }
   
         }
      }
    // }
  // }  
