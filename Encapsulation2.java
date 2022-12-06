class Sample{
  private String name="Amit";
  // Getter
  public String getInt(){
    return name;
  }
}



class Encapsulation2{
  public static void main(String args[]){
    Sample s=new Sample();
    System.out.println(s.getInt());
  }
}