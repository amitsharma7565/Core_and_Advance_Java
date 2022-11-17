// Football player

// name
// football

// Football
// type
// size
// weight

class Football{
  String name;
  int age;
  Type type;
  // constructor
  Football(String name,int age,Type type){
    this.name=name;
    this.age=age;
    this.type=type;
  }
}
class Type{
  String type;
  int size;
  int weight;
  // constructor
  Type(String type,int size,int weight){
    this.type=type;
    this.size=size;
    this.weight=weight;
  }
}

class Player{
  public static void main (String args[]){
    Type t=new Type("Round",123,23);
    Football f=new Football("Messi",25,t);
    System.out.println(t.type+" "+t.size+" "+t.weight);
    System.out.println(f.name+" "+f.age);
  }
}