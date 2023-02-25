class ReverseString12{
  public static void main(String args[]){
    String str="Champions League greats";
    String arr[]=str.split("");
    System.out.println(arr.length);
    for(int i=arr.length-1;i>=0;i--){
      System.out.print(arr[i]);
    }
    
    StringBuilder st= new StringBuilder(str);
    st.reverse();
    System.out.println(st);
  }
}