//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// the main class
public class AarogyaHospital{

	static int count=0;
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
    String name, gender, city,address, guardian_name, guardian_address,date_of_admission;
    int age,aadharNo,contactNumber,guardian_contact;
    boolean recoverd;
	    // make constructor for the class and assign it a unique Id
    int id;
	    public AarogyaMember(){
        id=count;
        count++;
        recoverd=false;
	    }
    
    	    // for taking patient information
	    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the gender");
        gender=sc.next();
        System.out.println("Enter the aadharNo");
        aadharNo=sc.nextInt();
         System.out.println("Enter the contactNumber");
        contactNumber=sc.nextInt();
        System.out.println("Enter the city");
        city=sc.next();
        System.out.println("Enter the address");
        address=sc.next();
        System.out.println("Enter the date_of_admission");
        date_of_admission=sc.next();
        System.out.println("Enter the guardian_name");
        guardian_name=sc.next();
        System.out.println("Enter the guardian_address");
        guardian_address=sc.next();
        System.out.println("Enter the guardian_contact");
        guardian_contact=sc.nextInt();
        System.out.println("patient register automattically assign ID is : "+id);
	    }
    
    public void display(AarogyaMember aro){
      System.out.println(aro.id+" "+aro.name+" "+aro.gender+" "+aro.aadharNo+" "+aro.contactNumber+" "+aro.city+" "+aro.address+" "+aro.date_of_admission+" "+aro.guardian_name+" "+aro.guardian_address+aro.guardian_contact);
    }
    
	}

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
          
    // create scanner class to take input
    Scanner sc=new Scanner(System.in);
	    long option=sc.nextLong();
	    return option;
	}
  

	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    boolean flag=false;
    AarogyaHospital obj= new AarogyaHospital();
    AarogyaHospital.AarogyaMember obj2= obj.new AarogyaMember();
		ArrayList<AarogyaHospital.AarogyaMember> list= new ArrayList<AarogyaHospital.AarogyaMember>();
		// initialise array list to store list of patients information
		
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			
			}
			// take the input and add in the arrayList
			else if(option==1){
        AarogyaHospital.AarogyaMember obj4= obj.new AarogyaMember();
        obj4.input();
        list.add(obj4);
        }
			//iterate and print all the patients information
	       		 else if(option==2){
              for(AarogyaHospital.AarogyaMember obj3:list){
                // obj2.display(obj3);
                System.out.println(obj3.id+" "+obj3.name+" "+obj3.gender+" "+obj3.aadharNo+" "+obj3.contactNumber+" "+obj3.city+" "+obj3.address+" "+obj3.date_of_admission+" "+obj3.guardian_name+" "+obj3.guardian_address+" "+obj3.guardian_contact);
              }
	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                    int id;
                    System.out.println("Enter the id");
                    id=sc.nextInt();
                    for(AarogyaMember obj3:list){
                      if(obj3.id==id){
                        obj2.display(obj3);
                        flag=true;
                      }
                    }
                    if(flag=false){
                      System.out.println("patient not found based on id");
                    }
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
                    String city;
                    System.out.println("Enter the city");
                    city=sc.next();
                    for(AarogyaMember obj3:list){
                      if(obj3.city.equals(city)){
                        obj2.display(obj3);
                        flag=true;
                      }
                    }
                    if(flag==false){
                      System.out.println("Patient not found based on city");
                    }
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
                   int age;
                   System.out.println("Enter the age");
                   age=sc.nextInt();
	                for(AarogyaMember obj3:list){
                    
                    if(obj3.age==age){
                      
                      obj2.display(obj3);
                      flag=true;
                    }
                  }
                  if(flag==false){
                    System.out.println("not patient matched with this age");
                  }
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
	                int id;
                   System.out.println("Enter the id");
                   id=sc.nextInt();
                   for(AarogyaMember obj3:list){
                     if(obj3.id==id){
                       obj3.recoverd=true;
                       obj2.display(obj3);
                     }
                   }
                   System.out.println(id+" ID patient recoverd");
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
                  int id;
                  System.out.println("Enter the id");
                  id=sc.nextInt();
                  AarogyaHospital.AarogyaMember abr=null;
                  for(AarogyaMember obj3:list){
                    if(obj3.id==id){
                     abr=obj3;
                    }
                    
                  }
                  list.remove(abr);
                  System.out.println("delete sucessfully");
	              }
			
	              else{
	             break;
	             }
		}
	}
}
