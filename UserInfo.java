class ContactDetails{
  private String mobile;
  private String alternateMobile;
  private String landLine;
  private String email;
  private String address;
  // Include getter and setters for all attributes in both the classes
  // setter to assign the value
  void setmobile(String mobile){
    this.mobile=mobile;
  }
  void setalternateMobile(String alternateMobile){
    this.alternateMobile=alternateMobile;
  }
  void setlandLine(String landLine){
    this.landLine=landLine;
  }
  void setemail(String email){
    this.email=email;
  }
  void setaddress(String address){
    this.address=address;
  }

  // getter to print the data
  String getmobile(){
    return mobile;
  }
   String getalternateMobile(){
    return alternateMobile;
  }
   String getlandLine(){
    return landLine;
  }
  String getemail(){
    return email;
  }
  String getaddress(){
    return address;
  }

  ContactDetails(){
    System.out.println("Defalut constructor");
  }
  
  ContactDetails(String mobile, String alternateMobile,String landLine, String email, String address){
    this.mobile=mobile;
    this.alternateMobile=alternateMobile;
    this.landLine=landLine;
    this.email=email;
    this.address=address;
  }
}

class User{
  private String name;
  private String username;
  private String password;
  private ContactDetails contactDetails;
  // Include getter and setters for all attributes in both the classes
  // setter to assign the value
  void setname(String name){
    this.name=name;
  }
    void setusername(String username){
    this.username=username;
  }
    void setpassword(String password){
    this.password=password;
  }
    void setcontactDetails(ContactDetails contactDetails){
    this.contactDetails=contactDetails;
  }
  // getter to print the data
  String getname(){
    return name;
  }
  String getusername(){
    return username;
  }
  String getpassword(){
    return password;
  }
  ContactDetails getcontactDetails(){
    return contactDetails;
  }
  User(){
     System.out.println("Defalut user constructor");
  }
   System.out.println("Defalut");
  User(String name, ContactDetails contactDetails, String username,String password){
    this.name=name;
    this.contactDetails=contactDetails;
    this.username=username;
    this.password=password;
  }
}

class UserInfo{
  public static void main(String args[]){
    ContactDetails c=new ContactDetails("123","456","789","amit@","xyz");
    User u=new User("abc","acs2","123678",c);
    c.setmobile("123");
    c.setalternateMobile("456");
    c.setlandLine("789");
    c.setemail("amit@");
    c.setaddress("xyz");
    u.setname("abc");
    u.setusername("acs2");
    u.setpassword("1234678");
    u.setcontactDetails(c);
    System.out.println(c.getmobile()+" "+c.getalternateMobile()+" "+c.getlandLine()+" "c.getemail()+" "+c.getaddress());
    System.out.println(u.getname()+" "+u.getusername()+" "+u.getpassword()+" "+u.getcontactDetails());
  }
}