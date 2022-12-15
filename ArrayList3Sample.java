import java.util.*;

class ArrayList3Sample {
  public static void main(String args[]) {
    ArrayList<String> a = new ArrayList<String>();
    a.add("4");
    a.add("67");
    a.add("654");
    a.add("5324");
    // System.out.println(a);
    ArrayList<String> a1 = new ArrayList<String>();
    // addAll Method
    a1.addAll(a);
    // System.out.println(a1);
    // get Method
    // System.out.println(a1.get(3));
    // is Empty method to check the list is empty or not
    // System.out.println(a1.isEmpty());
    // System.out.println(a.indexOf("4"));
    // System.out.println(a.lastIndexOf("645"));
    // toArray() to convert into the array
    //   Object obj[]=a.toArray();
    // for(int i=0;i<obj.length;i++){
    //   System.out.println(obj[i]);
    // }

  }
} 