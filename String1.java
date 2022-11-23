class Sample {
  public static void main(String args[]) {
   String s1="hi lalitha how are you";
    String words[]=s1.split(" ");
    System.out.println(words.length);
    for(int i=0;i<words.length;i++){
      System.out.println(words[i]+":"+words[i].length());
    }
  }
}