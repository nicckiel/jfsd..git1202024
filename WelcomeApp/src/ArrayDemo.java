
public class ArrayDemo {

	public static void main(String[] args) {
		int abc[]; // Declaration of an array
		//abc[]= {1,2,3}; // Invalid because...!
		//System.out.println(abc); N because , have declare values.
		//int xyz []= {10,20,30,40,50,}; //initialiazation of arrays---Example1
		int xyz []= {10,20,30,40,50, 60,70,80};     //initialiazation of arrays---Example2
		
		//System.out.println(xyz); //Not correct
		System.out.println("first value " + xyz[0]);
		System.out.println("second value " + xyz[1]);
		System.out.println("third value " + xyz[2]);
		System.out.println(" retireve the value using for loop");
		//System.out.println("first value " + xyz[i]);      //Pprint example1
		
		System.out.println("first value " + xyz.length);// This thea proper ty not methode bcosExample 2
		for(int i=0; i<xyz.length; i++) {  //Here I can customises the loop. startin from 2,3 ect
			
		     //System.out.println("Value using loop approach" + xyz[i]);
		     System.out.println("Value using loop and size  or length" + xyz[i]);
     }
		System.out.println(" Retrieve the value using enhanced loop");
		for (int n:xyz) {
			
			System.out.println("Value using for each" +n);
		}
   }
}
