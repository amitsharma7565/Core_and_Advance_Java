class Sample {
  private int i;
  private String name;

  // setter to assign the value
  public void setInt(int i) {
    this.i = i;
  }

  public void setName(String name) {
    this.name = name;
  }

  // getter to retur the value
  public int getInt() {
    return i;
  }

  public String getName() {
    return name;
  }
}

class Encapsulation1 {
  public static void main(String args[]) {
    Sample s=new Sample();
    s.setName("Amit");
    s.setInt(5);
    System.out.println(s.getInt()+" "+s.getName());
  }
}