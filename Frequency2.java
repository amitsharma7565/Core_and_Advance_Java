class Frequency2{
  public void check(){
    String str="Amit Sharma";
    str= str.toLowerCase();
    for(char ch='a';ch<='z';ch++){
      int count=0;
      for(int j=0;j<str.length();j++){
        if(ch==str.charAt(j)){
          count++;
        }
      }
      if(count!=0){
        System.out.println(ch+" "+count);
      }
      
    }
  }
  public static void main(String args[]){
    Frequency2 f=new Frequency2();
    f.check();
  }
}