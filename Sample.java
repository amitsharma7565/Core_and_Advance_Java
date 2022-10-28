/* Placement -- Ready     maybe     No

   WAP to accept   Assignement_score,  Mentors_feedback_score, C20 score

  --> The learner should pass in all the 3 subjects and passmarks is 50 in each.
  --> if the leaner got passed in 3 subjects then find out total score.
         ---> 70% from C20, 20% from Assignment , 10 % from Mentors_feedback

                  90 , 78, 98

    --> Based on total score dispaly "Ready" , "maybe" ,"No"
    
           if Total_score >80   --> Ready
            50-80    --> Maybe
          below 50  --> NO

  ---> if learners got failed in any one of the subjects, display subject name along 
with score.

           you got failed in assignemnts and your score is 40

*/

import java.util.*;

class Sample {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double total;
    System.out.println("check the placement eligibility");
    System.out.println("Enter your the Assignment Score");
    int assig = sc.nextInt();
    System.out.println("Enter your the Mentor feedback Score");
    int mentor = sc.nextInt();
    System.out.println("Enter your c20 Score");
    int c20 = sc.nextInt();
    if (assig >= 50 && mentor >= 50 && c20 >= 50) {
      total = ((70 * c20) / 100) + ((20 * assig) / 100) + ((10 * mentor) / 100);
      System.out.println("Total score is " + total);
      if (total >= 80) {
        System.out.println("Ready for placement");
      } else if (total >= 50 && total < 80) {
        System.out.println("maybe he is ready but clear doubts");
      } else {
        System.out.println("not eleigible");
      }
    } 
    else{
      if(assig<50){
         System.out.println("failed in assignment " + assig + " Score");
      }
    
      if (c20 < 50 ) {
        System.out.println("failed in c20 " + c20 + " Score");  
    } 
      if (mentor<50){
      System.out.println("mentor assignment fail " + mentor + " Score");
    }
    }   
  }
}