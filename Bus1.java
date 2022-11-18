class Bus{
  int gear;
  int mileage;
  int speed;
  Bus(int gear,int mileage,int speed){
    this.gear=gear;
    this.mileage=mileage;
    this.speed=speed;
  }
  void display(){
    System.out.println(gear+" "+mileage+" " +speed);
  }
}
class Bus1{
  public static void main(String args[]){
    Bus b=new Bus(5,20,120);
    b.display();
  }
}