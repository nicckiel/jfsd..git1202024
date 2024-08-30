
public class ArrayMemoryCreation {

	public static void main(String[] args) {
		int abc[] = new int [10];
       System.out.println("Size of array" + abc.length);
       System.out.println(abc [0]);
       System.out.println(abc [9]);
      // System.out.println(abc[10]); // exception generated
       abc[0] =100;
       abc[1] = 200;
       abc[2] =300;
        System.out.println("0 position value is" + abc[0]);
       System.out.println("1 position value is" + abc[1]);
       System.out.println("2 position value is" + abc[2]);
	}

}
