// 1,1,2,3,5,8,13
class Fibonici{
  public static void main(String args[]){
    int k,a=1,b=1;
    k=0;
    while(k<=120){
      k=a+b;
      System.out.print(k+" ");
      a=b;
      b=k;
    }
  }
}