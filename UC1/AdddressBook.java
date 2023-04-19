package Day9Java;

public class AdddressBook {
	
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private String address;
	private String city;
	private String state;
	private long zipcode;
	
	
	public AdddressBook(String firstName, String lastName, String email, String mobileNumber, String address, String city,
			String state, long zipcode) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "AdddressBook [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	
	
}
