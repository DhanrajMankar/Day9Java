package Day9Java;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<AddressBook> addressBook =new ArrayList<AddressBook>();
		
		addressBook.add(new AddressBook("Ram","Patil","ram@123","8329391987","Airoli","Mumbai","Maharastra",444709));
		addressBook.add(new AddressBook("Dhanraj","Mankar","dhanraj@123","832937","rajkhed","Amravati","Maharastra",878909));
		addressBook.add(new AddressBook("Vinay","Mane","vinay@123","832930907","Hadpsar","Pune","Maharastra",234567));
		addressBook.add(new AddressBook("Aditya","sharma","ars@123","832900987","sector2","Agra","UP",111709));


		ListIterator<AddressBook>iterate = addressBook.listIterator();
		System.out.println("Pls Enter First Name of person");
		String s=sc.nextLine();
		int n=0;
		
		while(iterate.hasNext())
		{
			
		n++;
		AddressBook ad=iterate.next();
		
		if (ad.getFirstName().equalsIgnoreCase(s))
		{
			break;
		}
		
		
		}
		System.out.println(addressBook.get(n-1));
		System.out.println("Arraylist size before deletion"+addressBook.size());
		
		addressBook.remove(n-1);
		
		System.out.println("Done");
		System.out.println("Arraylist size After deletion"+addressBook.size());
		
		
	}

}
