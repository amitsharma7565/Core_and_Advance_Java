class UsingStringBufferCheckContent{
  public static void main(String args[]){
    String str1="My name is Amit";
    String str2="My name is Amit Sharma";
    StringBuffer strBuffer=  new StringBuffer(str1);
    System.out.println(str2.contentEquals(strBuffer));
  }
}