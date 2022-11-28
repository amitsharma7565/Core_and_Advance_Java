class Xor1{
  public static void main(String args[]){
    int a=5;//101
    int b=10;//1010
   a= a^b; //0101^1010-->1111
    b=b^a;//1010^1111-->0101
    a=a^b; //1111^0101-->1010
    System.out.println(a+" "+b);
  }
}