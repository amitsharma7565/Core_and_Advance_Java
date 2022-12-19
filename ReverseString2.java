class ReverseString2{
  public void reverse(){
    String str=" my name is Amit sharma";
    String rev="";
    for(int i=str.length()-1;i>=0;i--){
      rev=rev+ str.charAt(i);
    }
    System.out.println(rev);
  }
  public static void main(String args[]){
    ReverseString2 r=new ReverseString2();
    r.reverse();
  }
}