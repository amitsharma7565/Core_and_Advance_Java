class FindFrequencyOfElement{
  public static void main(String args[]){
    String str="akashinstute";
    for(char ch='a';ch<='z';ch++){
      int count=0;
      for(int i=0;i<str.length();i++){
        if(ch== str.charAt(i)){
          count++;
        }
      }
      if(count>0){
          System.out.println(ch+" "+count);
        }
    }
  }
}