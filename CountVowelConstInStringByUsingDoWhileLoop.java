// using do while loop;
class CountVowelConstInStringByUsingDoWhileLoop{
  public static void main(String args[]){
    String str="vowel";
    char ch[]=str.toCharArray();
    int length;
    int vowelCount=0;
    int constCount=0;
    int len=ch.length-1;

do{ if(ch[len]=='a'||ch[len]=='e'||ch[len]=='i'||ch[len]=='o'||ch[len]=='u'){
        vowelCount++;
      }
      else{
        constCount++;
      }
      len--;
}  while(len>=0);

    System.out.println("vowel is"+vowelCount);
    System.out.println("const is"+constCount);
  }
}