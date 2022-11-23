class MinString {
  public static void main(String args[]) {
   String s1="hi mam you are wow";
    String words[]=s1.split(" ");
   // System.out.println(words.length);
    int min=words[0].length();//2
    int index=0;
    for(int i=1;i<words.length;i++){
      if(min>words[i].length()){
        min=words[i].length();
        index=i;
      }
    
    }
     System.out.println(words[index]+":"+min);
     
  }
}