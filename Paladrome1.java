class Paladrome1{
public static void main(String args[]){
  String s1="hi mam wow";
  String rev= " ";
  String words[]=s1.split(" ");
  System.out.println(words.length);
  for(int i=0;i<words.length;i++){
    // System.out.println(words[i] +" = " +words[i].length());
    rev=" ";
   for(int j=words[i].length()-1;j>=0;j--){
     rev=rev+s1.charAt(i);
    }
    if(words[i].equals(rev)){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }  
  }
}
}