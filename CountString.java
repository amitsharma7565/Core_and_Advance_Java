// count alphabets,numbers and specialcharacters in string
class CountString{
  public static void main(String args[]){
    String str="amits@123a";
    int numDigit=0;
    int numAlpha=0;
    int numSpecial=0;
    
   // String str1[]=str.split("");
    for(int i=0;i<str.length();i++){
     char ch=str.charAt(i);
      if(ch>='a'&&ch<='z'){
        numAlpha++;
      }
      else if(ch>='0'&&ch<='9'){
        numDigit++;
      }
      else{
        numSpecial++;
      }
    }
    System.out.println("Number of AlphaBets is "+numAlpha);
    System.out.println("Number of Digits is "+numDigit);
    System.out.println("Number of SpecialChar is "+numSpecial);
  }
}