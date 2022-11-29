class Sample{
  void show(int ... a){
    for(int i:a){
      System.out.println(i);
    }
    
  }
}
class Vargs{
  public static void main(String args[]){
    Sample s=new Sample();
  
    s.show(4,5,6);
  }
}