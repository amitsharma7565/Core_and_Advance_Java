// count alphabet
//count digit
//count specical char
class Methods{
  public static void countAlphabet(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
      if((str.charAt(i)>='A'&& str.charAt(i)<='Z'||str.charAt(i)>='a'&& str.charAt(i)<='z')){
        count++;
      }
    }
    System.out.println("Alphabet is "+count);
  }
  // count digit
  public static void countDigit(String str){
    int countDigit=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>'0'&& str.charAt(i)<'9'){
        countDigit++;
      }
    }
    System.out.println("Digit is "+countDigit);
  }

  // count special charcter
  public static void countSpecial(String str){
    int countSpecial=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='@'||str.charAt(i)=='&'||str.charAt(i)=='%'){
        countSpecial++;
      }
    }
    System.out.println(countSpecial);
  }
}




class CharcterRead{
  public static void main(String args[]){
    Methods.countAlphabet("Amit@123");
    Methods.countDigit("Amit@123");
    Methods.countSpecial("Amit@123");
  }
}