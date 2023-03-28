class StringReverse12{
  
  public static void reverseOfString(String str){
   String str2[]= str.split("");
    for(int i=str2.length-1;i>=0;i--){
      System.out.print(str2[i]);
    }
  }
  public static void main(String args[]){
   reverseOfString("Amit");
  }
}