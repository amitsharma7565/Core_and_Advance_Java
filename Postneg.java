import java.util.*;
class Postneg{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int countPos=0,countNeg=0;
    System.out.println("Enter the row Size");
    int row=s.nextInt();
    System.out.println("Enter the row Size");
    int colm=s.nextInt();
    int a[][]=new int[row][colm];
    System.out.println("Enter the array");
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        a[i][j]=s.nextInt();
      }
    }
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length;j++){
        if(a[i][j]>0){
          countPos++;
        }
        else{
          countNeg++;
        }
      }
  }
    System.out.println("The postive number in array is "+countPos);
    System.out.println("The negative number in array is "+countNeg);
}
}