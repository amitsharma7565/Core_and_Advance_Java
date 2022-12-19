
class FindString{
    public void FindSpecialChar(String str){
    if(str.contains("@")){
     System.out.println("yes");
      System.out.println(str.indexOf("@"));
    }
  }
  public static void main(String args[]){
    FindString f=new FindString();
    f.FindSpecialChar("Amit@123");
  }
}

// insert method
2
// delete method
2