package Day9Java;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*cityAddressBook ob1 = new AddressBook();
 
		
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
		System.out.println();
		
		*/
		
		AddressBook ob2 = new AddressBook("Ram","Patil","ram@123","8329391987","Airoli","Mumbai","Maharastra",444709);
		
		System.out.println("Enter the attribute that you need to update/change");
		System.out.println("firstName");
		System.out.println("LastName");
		System.out.println("email");
		System.out.println("mobileNumber");
		System.out.println("address");
		System.out.println("city");
		System.out.println("state");
		System.out.println("zipcode");
		String s=sc.nextLine();
		
		switch (s) {
		case "firstName":
			System.out.println("This is the privious record "+ob2.getFirstName());
			System.out.println("Pls Enter updated firstName");
			ob2.setFirstName(sc.nextLine());
		break;
		
		case "LasttName":
			System.out.println("This is the privious record "+ob2.getLastName());
			System.out.println("Pls Enter updated LastName");
			ob2.setLastName(sc.nextLine());
		break;
		
		case "email":
			System.out.println("This is the privious record "+ob2.getEmail());
			System.out.println("Pls Enter updated email");
			ob2.setEmail(sc.nextLine());
		break;
		
		case "mobileNumber":
			System.out.println("This is the privious record "+ob2.getMobileNumber());
			System.out.println("Pls Enter updated MobileNumber");
			ob2.setMobileNumber(sc.nextLine());
		break;
		
		case "city":
			System.out.println("This is the privious record "+ob2.getCity());
			System.out.println("Pls Enter updated city");
			ob2.setEmail(sc.nextLine());
		break;
		
		case "state":
			System.out.println("This is the privious record "+ob2.getState());
			System.out.println("Pls Enter updated firstName");
			ob2.setAddress(sc.nextLine());
		break;
		
		case "zipcode":
			System.out.println("This is the privious record "+ob2.getZipcode());
			System.out.println("Pls Enter updated zipcode ");
			ob2.setZipcode(sc.nextLong());
		break;
		
        default : System.out.println("Pls enter valid attribute input");
		}
		System.out.println("Done record updated");
	}
}
