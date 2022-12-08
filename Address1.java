import java.util.*;
class Address{
  private int userId;
  private String street;
  private String city;
  private String state;

  // setter
  public void setUserId(int userId){
    this.userId=userId;
  }
  public void setStreet(String street){
    this.street=street;
  }
  public void setCity(String city){
    this.city=city;
  }
  public void setState(String state){
    this.state=state;
  }

  // getter
  public int getUserId(){
    return userId;
  }
  public String getStreet(){
    return street;
  }
  public String getCity(){
    return city;
  }
  public String getState(){
    return state;
  }

  // default constructor
  Address(int userId, String street, String city, String state){
    this.userId=userId;
    this.street=street;
    this.city=city;
    this.state=state;
  }
}
class Address1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the address");
    String s=sc.nextLine();
    String s1[]=new String[4];
    s1=s.split(",");
    Address ad=new Address(Integer.parseInt(s1[0]),s1[1],s1[2],s1[3]);
    // table format we print data
    System.out.format("%-15s %-15s %-15s %s\n", "user Id","street","city","state");
 System.out.format("%-15s %-15s %-15s %s\n",ad.getUserId(),ad.getStreet(),ad.getCity(),ad.getState());
    System.out.format("%-15s %-15s %-15s %s\n",ad.getUserId(),ad.getStreet(),ad.getCity(),ad.getState());
    System.out.format("%-15s %-15s %-15s %s\n",ad.getUserId(),ad.getStreet(),ad.getCity(),ad.getState());
    System.out.format("%15s %15s %15s %s\n",ad.getUserId(),ad.getStreet(),ad.getCity(),ad.getState());
  }
}