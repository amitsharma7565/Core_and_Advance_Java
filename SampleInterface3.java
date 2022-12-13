interface Bank{
  int interset();
}

class Sbi implements Bank{
  public int interset(){
    return 100;
  }
}
class Hdfc implements Bank{
  public int interset(){
    return 200;
  }
}

class SampleInterface3{
  public static void main(String args[]){
  System.out.println(new Sbi().interset());
  }
}