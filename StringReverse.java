class Reverse{
  public void Rev(){
    String str="hi how are you";
  String str1[]=str.split(" ");
  for(int i=0;i<str1.length;i++){
  System.out.println(str1[i]);
  }
  }
  
}


class StringReverse{
  public static void main(String args[]){
    Reverse r=new Reverse();
    r.Rev();
  }
}