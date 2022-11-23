class Digit{
  public static void main(String args[]){
    String s="a1b2c3";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
        System.out.print(s.charAt(i));
      }
    }
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='1'&&s.charAt(i)<='9'){
        System.out.print(s.charAt(i));
      }
    }
  }
}