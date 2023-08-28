

class StringToByteToString{
  public static void main(String args[]){
    String str="hi my name is Amit Sharma";
    byte[] arr= str.getBytes();
    String str2= new String(arr);
    System.out.println(str2);
  }
}