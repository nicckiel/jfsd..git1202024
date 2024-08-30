import java.util.Scanner;

public class TakingValueThroughKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		int a = sc.nextInt(); // It is used to scan int value
		
		System.out.println("Enter the value of b ");
		int b = sc.nextInt(); // It is used to scan int value
		
		int sum =a + b ;
		System.out.println("Sum of the 2 numbers is " + sum);
		

		System.out.println("Enter your id");
		 int id = sc.nextInt();
		 
		 System.out.println("Enter your name");
		 String name = sc.next();   // This scan string value
		 
		 System.out.println("Enter your salary");
		 float Salary = sc.nextFloat();
		 System.out.println("Id is " + id );
		 System.out.println("name is " + name );
		 System.out.println("salary is " + Salary );
		 
		 
	}

}
