/* 5. Write a program to control execution order of the threads using join() method. */

	// creating class called ThreadScheduling and extending from Thread class
	public class ThreadScheduling2 extends Thread {
		// overriding run() method    
    		public void run() {
			System.out.println("Before change : "+Thread.currentThread().getName());   
			// change running thread name to bitLabs
			Thread.currentThread().setName("bitLabs");
			// print Running thread name
        		System.out.println("after change: "+Thread.currentThread().getName());        
        		// iterate for loop 10 times and print I value
           		for(int i=1;i<=10;i++) {
           
           			System.out.println(i);
           			try{
					//call sleep method
           				Thread.sleep(1000);
           			}
           			catch(Exception e){
               				System.out.println(e);
           			}
        		}
    		}
    		public static void main(String args[]){
        		// creating two objects for ThreadScheduling2 class 
        		ThreadScheduling2 t1=new ThreadScheduling2();
        		ThreadScheduling2 t2=new ThreadScheduling2();
     			// call start() method with t1
        		t1.start();
            		try{
 				// call join() method
           			t1.join();
            		}
            		catch(Exception e){
                		System.out.println(e);
            		}
                	// call start() method with t2
        		t2.start();
    		}
}
