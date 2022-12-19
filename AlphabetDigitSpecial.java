class AlphabetDigitSpecial{
  public static void main(String args[]){
    char ch='a';
    if((ch>'a' && ch<'z')||(ch>'A'&& ch<'Z')){
        System.out.println("Charcter");
    }
    else if(ch>'0'&&ch<'9'){
      System.out.println("Digit");
    }
    else{
      System.out.println("Special Charcter");
    }
  }
}