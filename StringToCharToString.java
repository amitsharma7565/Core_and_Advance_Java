// Write a Java program to get the contents of a given string as a character array.
class StringToCharToString{
  public static void main(String args[]){
    String str=new String("hi my name is Amit Sharma");
    
    char[] ch= new char[12];
    try{
       str.getChars(6,10,ch,8);
        System.out.println(ch);
    }
   catch(Exception e){
     System.out.println(e);
   }
   
  }
}