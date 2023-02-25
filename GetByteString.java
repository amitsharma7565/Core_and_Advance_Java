class GetByteString{
  public static void main(String args[]){
    String str= "Hi i am Amit Sharma";
    byte[] arr= str.getBytes();
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);
    // }

    String newStr2= new String(arr);
    System.out.println(newStr2);
  }
}