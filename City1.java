import java.util.*;
class City{
  String Cityname;
  
  City(String Cityname){
    this.Cityname=Cityname;
   // this.address=address;
  }
}
class State{
  String Sname;
  City city[]=new City[5];
  State(String Sname,City city[]){
    this.Sname=Sname;
    this.city=city;
  }
}
class Country{
  String Cname;
  State state;
  Country(String Cname,State state){
    this.Cname=Cname;
    this.state=state;
  }
}

class City1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   
   City city[]=new City[5];
    System.out.println("enter cities");
    for(int i=0;i<5;i++){
      city[i]=new City(sc.next());
    }
     City city1[]=new City[5];
    System.out.println("enter cities");
    for(int i=0;i<5;i++){
      city1[i]=new City(sc.next());
    }
    State state=new State("AP",city);
    State state1=new State("telgana",city1);
    
    

    Country country=new Country("India",state);
    
    Country country1=new Country("India",state1);
     System.out.println("Country is : "+country.Cname);
    System.out.println("State is : "+state.Sname);
    System.out.println("Ciites are");
    for(int i=0;i<5;i++){
       System.out.println(city[i].Cityname);
    }
    System.out.println("State is : "+state1.Sname);
   
    for(int i=0;i<5;i++){
       System.out.println(city1[i].Cityname);
    }
  }
}