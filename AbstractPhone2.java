abstract class phone{
  public abstract void Showconfig();
}

class Iphone extends phone{
  public void Showconfig(){
    System.out.println("2gb,ios");
  }
}

class Samsung extends phone{
  public void Showconfig(){
    System.out.println("2gb,lolipop");
  }
}


// main class 
class AbstractPhone2{
  public static void main(String args[]){
  
  }
  public static void show(Iphone obj){
    obj.Showconfig();
  }
}