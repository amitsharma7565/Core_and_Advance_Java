class AssignmentOperatorSample{
  public static void main(String args[]){
    int a,b,c,d;
    a=b=c=d=20;
    a+= b-= c*= d/=2;
    System.out.println(a+" "+b+" "+c+" "+d);
    
  }
}