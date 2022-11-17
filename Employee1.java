class Address {
  String state;
  String city;
  String streetname;
  int drno;

  // make a constructor
  Address(String state, String city, String streetname, int drno) {
    this.state = state;
    this.city = city;
    this.streetname = streetname;
    this.drno = drno;
  }
}

class Employee {
  int eid;
  String ename;
  String edept;
  int esalary;
  Address address; // agregation
  // make constructor

  Employee(int eid, String ename, String edept, int esalary, Address address) {
    this.eid = eid;
    this.ename = ename;
    this.edept = edept;
    this.esalary = esalary;
    this.address = address;
  }

  void display() {
    System.out.println(eid + " " + ename + " " + edept + " " + esalary);
    System.out.println(address.state + " " + address.city + " " + address.streetname + " " + address.drno);
  }
}

class Employee1 {
  public static void main(String args[]) {
    // object create
    Address address1 = new Address("AP", "Vijayawada", "Madhapur colony", 23);
    Address address2 = new Address("AP", "Guntur", "Gurunank Colony", 123);
    Employee emp1 = new Employee(34, "lalitha", "IT", 50000, address1);
    Employee emp2 = new Employee(45, "kavitha", "Accounts", 60000, address2);
    emp1.display();
    emp2.display();

  }
}
