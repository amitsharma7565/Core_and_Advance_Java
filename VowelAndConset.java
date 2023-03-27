class VowelAndConset{
  public static void main(String args[]){
    String str="abcdefghiouu";
    // String str2[]= str.split("");
    // char ch;
    int vowel=0;
    int cons=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        vowel++;
      }
      else{
        cons++;
      }
    }
    System.out.println("vowel is "+vowel);
    System.out.println("const is "+cons);
  }
}