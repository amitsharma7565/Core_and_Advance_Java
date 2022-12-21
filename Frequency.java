class Frequency{
  public void freq(){
    String str="My name is Amit sharma";
    str=str.toLowerCase();
    for(char ch='a';ch<='z';ch++){
      int count=0;
      for(int i=0;i<str.length();i++){
        if(ch==str.charAt(i)){
          count++;
        }
      }
      if(count!=0){
        System.out.println(ch+" "+count);
      }
      
    }
  }
  
  public static void main(String args[]){
    Frequency f=new Frequency();
    f.freq();
  }
}