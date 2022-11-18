// class Bank{
//   int IFSCcode=123444;
//   void rateOfInterest(){
//     System.out.println("Interest is 80ps");
//   }
// }
// class SBI extends Bank{
//   int IFSCcode=567890;
//    void rateOfInterest(){
//     System.out.println("Interest is 60ps");
//   }
// }
// class HDFC extends Bank{
//   int IFSCcode=9876;
//    void rateOfInterest(){
//     System.out.println("Interest is 70ps");
//       super.rateOfInterest();
//   }
//     void printIFSC(){
//          System.out.println("Parent IFSC:"+super.IFSCcode);
//        System.out.println("childclass IFSC:"+IFSCcode);
//       }
// }
// class Bank1{
//   public static void main(String args[]){
//     HDFC hdfc=new HDFC();
//     System.out.println(hdfc.IFSCcode); 
//     hdfc.rateOfInterest();
//     hdfc.printIFSC();
//   }
// }


class Bank{
  int Ifsc=13440;
  void rateOfInterest(){
    System.out.println("Interset in bank is 80s");
  }
}
class Sbi extends Bank{
  int Ifsc=13441;
  void rateOfInterest(){
    System.out.println("interset in Sbi bank is 60s");
  }
}
 class Hdfc extends Bank {
   int Ifsc=13442;
   void rateOfInterest(){
     System.out.println("interset in Hdfc bank is 70s");
     super.rateOfInterest();
   }
   void printIFSC(){
       System.out.println("Parent IFSC:"+super.Ifsc);
       System.out.println("childclass IFSC:"+Ifsc);
      }
 }

class Bank1{
  public static void main(String args[]){
    Hdfc hd=new Hdfc();
    hd.rateOfInterest();
    int c=hd.Ifsc;
    System.out.println("Child class Ifsc "+c);
    hd.printIFSC();
    // System.out.println("Parents class Ifsc "+d);
  }
}
