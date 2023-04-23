

public class Contact{
    
    private String contactID;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;


	public Contact (String contactID, String firstName, String lastName, String phoneNum, String address) {
	    this.contactID = contactID;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNum = phoneNum;
	    this.address = address;
	}

/*methods for set and get */

//get unique contact ID
	public String getContactID() {
	return contactID;
	}

//get first name
	public String getFirstName() {
	return firstName;
	}

//set first name
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

//get last name
	public String getLastName() {
	return lastName;
	}

//set last name
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}


//get phone number
	public String getphoneNum() {
	    return phoneNum;
	}

//set phone number
	public void setphoneNum(String phoneNum) {
	    this.phoneNum = phoneNum;
	}

//get address
	public String getAddress() {
	return address;
	}

//set address
	public void setaddress(String address) {
	    this.address = address;
	}
	
};