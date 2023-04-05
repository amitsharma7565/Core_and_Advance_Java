class InThatPlaceReverseString{
  public static void main(String args[]){
    String str="hi my name is Amit";
    String str2[]=str.split(" ");
    String words=""; 

    String mainString="";
    for(int i=0;i<str2.length;i++){
      words=str2[i];
        String revWords="";
      for(int j=words.length()-1;j>=0;j--){
        revWords=revWords+words.charAt(j);
      }
      mainString=mainString+revWords+" ";
    }
    System.out.println(mainString);
    
    
}
}