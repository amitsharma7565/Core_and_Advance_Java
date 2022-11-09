// Write a JAVA program to count total number of negative elements in an array.
class Negative{
  public static void main(String args[]){
    int a[]={1,4,5,66,-56,34,-78,99,-654};
    int count=0;
    for(int i=0;i<a.length;i++){
      if(a[i]<0){
        count++;
      }
    }
    System.out.println("Negative number in a list "+count);
  }
}