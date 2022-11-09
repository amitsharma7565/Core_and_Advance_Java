// Write a JAVA program to copy all elements from an array to another array
class Copy{
  public static void main(String args[]){
    int a[]={1,2,3,4,5,8};
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++){
      b[i]=a[i];
    }
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}