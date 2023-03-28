class Stringpaladrome{
  public static void main(String args[]){
    String str="level";
    String str3="";
    for(int i=str.length()-1;i>=0;i--){
      str3=str3+str.charAt(i);
    }
if(str.equals(str3)){
  System.out.println("its a pladrome number");
}
    else{
      System.out.println("its not a pladrome number");
    }
  }
}