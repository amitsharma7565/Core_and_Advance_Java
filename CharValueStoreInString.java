class CharValueStoreInString{
  public static void main(String args[]){
    char arr[]={'1','1','2','4','4','3','3','4','2','5'};
    // for(int i=0;i<arr.length;i++){
    //   System.out.println(arr[i]);
    // }
    String str1= String.copyValueOf(arr,5,3);
    System.out.println(str1);
  }
}  