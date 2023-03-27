class ReverseThatPlaceString{
  public static void main(String args[]){
    String str= "hi my name is Amit";
    String words[]= str.split(" ");
    String res="";
    for(int i=0;i<words.length;i++){
     String singleWord= words[i];

      String reserverWordSingle="";
      for(int j=singleWord.length()-1;j>=0;j--){
       reserverWordSingle=reserverWordSingle+singleWord.charAt(j);
      }
      res= res+reserverWordSingle+" ";
    }
  System.out.println(res);
  }
    
}