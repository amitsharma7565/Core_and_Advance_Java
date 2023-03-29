class AccessPrivateVariable{
  private int id;
  private String name;
// getter and setter

  // setter 

  public void setId(int id){
    this.id=id;
  }
    public void setName(String name){
    this.name=name;
  }
// getter
  public int getId(){
    return id;
  }
    public String getName(){
    return name;
  }
  public static void main(String args[]){
    AccessPrivateVariable a= new AccessPrivateVariable();
    a.setId(1);
    a.setName("Amit");

    System.out.println(a.getId());
    System.out.println(a.getName());
  }
  
}