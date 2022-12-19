class ReverseString1{
  public static void main(String args[]){
    String s="Amitrfdg4534";
    int length=s.length();
    String rev="";
    // System.out.println(length);
    for(int i=s.length()-1;i>=0;i--){
      rev=rev+s.charAt(i);
    }
    System.out.println(rev);
  }
}