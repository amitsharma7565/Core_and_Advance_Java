
import java.util.*;
// main class and method
class ArrayListPrime{
  public static void main (String args[]){
    int count=0;
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    a.add(6);
    a.add(7);
    // normal for loop
    for(int i=0;i<a.size();i++){//0;0<6
         count=0;
      for(int j=1;j<=a.get(i);j++){//1;1<
        if(a.get(i)%j==0){
          count++;
        }
      }
        if(count==2){
          System.out.println(a.get(i));
        }
      }
      
    
    
  }
}