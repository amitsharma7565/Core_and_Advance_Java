// Bank Person Details
class Sample{
  // Data member or variable
  private long acc_no;
  private String name,email;
  private float amount;
  // use setter and getter
  // setter to assign the values
  public void setAc(long acc_no){
    this.acc_no=acc_no;
  }
    public void setName(String name){
    this.name=name;
  }
    public void setEmail(String email){
    this.email=email;
  }
    public void setAm(float amount){
    this.amount=amount;
  }
  // getter to return the value
  public long getAc(){
  return acc_no;
}
public String getName(){
  return name;
}public String getEmail(){
  return email;
}public float getAm(){
  return amount;
}
}
class Encapsulation3{
  public static void main(String args[]){
    Sample s=new Sample();
    s.setAc(1234676L);
    s.setName("Amit");
    s.setEmail("amitsharma7565@gmail.com");
    s.setAm(5000.0f);
    System.out.println(s.getAc()+" "+s.getName()+" "+s.getEmail()+" "+s.getAm());
  }
}