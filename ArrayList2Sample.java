import java.util.*;

class ArrayList2Sample{
  public static void main(String args[]){
    ArrayList<String> a=new ArrayList<String>();
    a.add("Amit");
    a.add("Sharma");
    a.add("Thakur");
    // for each 
    for(String s:a){
      
      System.out.println(s);
    }
    // for loop
    // for(int i=0;i<a.size();i++){
    //   System.out.println(a.get(i));
    // }
    //  through itteration 
    // Iterator itr=a.iterator();
    // while(itr.hasNext()){
    //   System.out.println(itr.next());
    // }
  }
}
