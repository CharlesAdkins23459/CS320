import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact = new Contact("C001", "Crash", "Dummy", "3308675309", "1600 Pennsylvania Ave."); 

    @Test
    void getContactID() {
        assertEquals("C001", contact.getContactID());
    }

    @Test
    void getFirstName() {
        assertEquals("Crash", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Dummy", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("3308675309", contact.getphoneNum());
    }

    @Test
    void getAddress() {
        assertEquals("1600 Pennsylvania Ave.", contact.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=C001, firstName=Crash, lastName=Dummy, phoneNumber=3308675309, address=1600 Pennsylvania Ave.]", contact.toString());
    }

};