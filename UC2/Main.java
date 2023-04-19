package Day9Java;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AddressBook ob1 = new AddressBook();
 
		System.out.println("pls Enter the details person");
		
		System.out.println("Enter the First Name ");
		ob1.setFirstName(sc.nextLine());
		
		System.out.println("Enter the Lasst Name ");
		ob1.setLastName(sc.nextLine());
		
		System.out.println("Enter the email");
		ob1.setEmail(sc.nextLine());
		
		System.out.println("Enter the Mobile number ");
		ob1.setMobileNumber(sc.nextLine());
		
		System.out.println("Enter the Address ");
		ob1.setAddress(sc.nextLine());
		
		System.out.println("Enter the city ");
		ob1.setCity(sc.nextLine());
		
		System.out.println("Enter the zip/pin code ");
		ob1.setZipcode(sc.nextLong());
		
		System.out.println("Enter the State");
		ob1.setState(sc.nextLine());
		
		System.out.println(ob1.toString());
	}
}
