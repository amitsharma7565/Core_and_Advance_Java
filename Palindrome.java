class Palindrome{
  public static void main(String args[]){
    int num=111;
    int temp=num;
    int last;
    int sum=0;
   while(num>0){
      last=num%10;
     sum=(sum*10)+last;
      num=num/10;
    }
     if(temp==sum){
      System.out.println("yes it is palindrome");
    }
    else{
      System.out.println("no it is palindrome ");
    }
    
  }
}