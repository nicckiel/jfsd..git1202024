package abc;

public class carsMethodesInstanceVariables {
	//Property (declaration and initialization)
		 int wheel;
		 String colour;
		 float price;// 2nd  coding --Instance variable.
		 
		 //Behaviours ( method)
		 
	     void start() {
	    	 System.out.println("Car start");
	     }
	      void appliedGear() {
	    	  System.out.println("applied gear");
	      }
	     void driveOn() {
	    	 System.out.println("drivngOn car");
	     }
	     void stopping() {
	    	 System.out.println("stopiing car");
	     }
	     void carInfo(String name) {
	    	 String Info=("Car details" + name );// 2nd coding Local Variable.
	    	 System.out.println(Info);
	    	 System.out.println("Wheel" + wheel);
	    	 System.out.println("colour" + colour);
	    	 System.out.println("price" + price);
	    	 
	    	 
	    	 
	     }
}