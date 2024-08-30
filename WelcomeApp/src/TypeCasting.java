
public class TypeCasting {

	public static void main(String[] args) {
		byte a=100;  // byte range -128 to 127
		short b=a;   //implicit type casting. short range -32678 to 32768.
		System.out.println("a" + a);
		System.out.println("a" + b);
		
		short  c=128;  // 2 byte memory and value is 100
		//byte d=c  // Cannot hold the 2 byte memory of value 100 bcos..
	    byte d = (byte) c;  // convert.. explicit type casting
	    System.out.println("c" + c);
	    System.out.println("c" + d);
	    
	    // int and float family
	    int m =100 ;
	    float n=m;   // implicit
	    
	    System.out.println("m "+m);
	    System.out.println("n "+n);
	    float j =100;
	    
	   // float j = (float)100.0;   // implicit type casting,bcos for every decimal number, we consider double.
	   // float j =100.0f;          // implicit type casting
	    
	    int p= (int)j;  // explicit
	    System.out.println("j"+j); 
	    System.out.println("p"+p);
		
		}
 }


