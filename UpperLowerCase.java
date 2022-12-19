class UpperLowerCase{
  public void upper(){
    String str="Amit";
    String str2=str.toUpperCase();
    System.out.println(str2);
  }
   public void lower(){
    String str="Amit";
    String str2=str.toLowerCase();
    System.out.println(str2);
  }
  
  public static void main(String args[]){
    UpperLowerCase u=new UpperLowerCase();
    u.upper();
    u.lower();
  }
}