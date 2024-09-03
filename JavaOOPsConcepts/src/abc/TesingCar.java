package abc;

public class TesingCar {

	public static void main(String[] args) {
	//	start();
		// Create Object as method to Access class Car
//    	Car pegeaot = new Car(); // heap memory created
//		pegeaot.start();
//		pegeaot.appliedGear();
//		pegeaot.driveOn();
//		pegeaot.stopping();
//		
		Car pegeaot = new Car(); // 2nd Method To display  the default values
		pegeaot.carInfo("Peogeaot car");  // 2nd Method To display  the default values
		
		pegeaot.colour="white";
		pegeaot.price = 27000 ;
	    pegeaot.wheel =4;
	    pegeaot.carInfo( "Pageoat Car");
	    
	    System.out.println("--------------------------------------------");
	    
	    Car bmw = new Car(); // 2nd Method To display  the default values
		bmw.carInfo("BMW CAR");  // 2nd Method To display  the default values
		bmw.colour="Blue";
		bmw.price = 27000 ;
	    bmw.wheel = 12;
	    bmw.carInfo("BMW CAR");

	}

	
	
}
