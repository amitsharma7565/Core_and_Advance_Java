import java.util.*;
class Fruit{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String a[]={"Apple","Banana","Orange","Watermelon"};
    System.out.println("Enter the Fruit name");
    String name=s.next();
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i].equals(name)){
        count++;
        break;
      }
     
    }
    if(count==1){
      System.out.println("item found");
    }
    else{
      System.out.println("Item not found");
    }
  }
}