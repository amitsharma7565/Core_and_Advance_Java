// a=p*(1-r/100)^n
//   p=Purchase value of a car
//   r=rate of car
//   n=number f years

class Carvalue {
  public static void main(String args[]) {
    double inital_cost = 12000, rate = 10, year = 2;
    double cost = inital_cost * Math.pow((1 - rate / 100), year);
    System.out.println("the current value is " + cost);
  }
}
