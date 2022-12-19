// to find last Occurance
class Sample{
  public void lastOccurance(){
    String str="hi i am Amit sharma";
    System.out.println(str.lastIndexOf('m'));
  }
}
class LastOccurance{
  public static void main(String args[]){
    Sample s=new Sample();
    s.lastOccurance();
  }
}