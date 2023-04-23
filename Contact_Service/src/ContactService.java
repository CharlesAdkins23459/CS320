import java.util.ArrayList;

public class ContactService {

    /* for a list of contacts */
    private ArrayList<Contact> contacts;

    /* default constructor */
    public ContactService() {
        contacts = new ArrayList<>();
    };

    /* this method adds a contact to our list if it doesn't exist */
    public boolean add(Contact contact) {
    
        /* if the contact is already present */
        boolean alreadyPresent = false;
        for (Contact c : contacts) {
            if (c.equals(contact)) {
                alreadyPresent = true;
            }
        }


    /* if the contact does not exist, we add it, and return true */
        if (!alreadyPresent) {
            contacts.add(contact);
            System.out.println("Contact Added Successfully!");
            return true;
        } else {
            System.out.println("Contact already present");
            return false;
        }
    }

    /* removes a contact based upon contactId if it exists in our contacts list */
    public boolean remove(String contactID) {
        for (Contact c : contacts) {
            if (c.getContactID().equals(contactID)) {
                contacts.remove(c);
                System.out.println("Contact removed Successfully!");
                return true;
            }
        }
    
        System.out.println("Contact not present");
        return false;
    }

    /*
    * this method updates the information for the contactID. if ID is found it will updated its
    * first name, last name and number address
    */
    public boolean update(String contactID, String firstName, String lastName, String address, String phoneNum) {
        
        for (Contact c : contacts) {

            if (c.getContactID().equals(contactID)) {
                if (!firstName.equals("")){
                    c.setFirstName(firstName);
                };
                if (!lastName.equals("")){    
                    c.setLastName(lastName);
                };
                if (!phoneNum.equals("")){
                    c.setphoneNum(phoneNum);
                };
                if (!address.equals("")){
                    c.setAddress(address);
                };
                
                
            System.out.println("Contact updated Successfully!");
            return true;
            };
        };
        System.out.println("Contact not present");
        return false;
    };

};