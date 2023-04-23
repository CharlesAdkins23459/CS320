import static org.junit.Assert.*;
import org.junit.Test;



public class ContactServiceTest {

/* testing add method */
    @Test
    public void testMethodAddPass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "102 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c2));
        assertEquals(true, cs.add(c3));
    }

/* testing the add method as a failed example */
    @Test
    public void testMethodAddFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "102 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(false, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));
    }

    /* testing delete method */
    @Test
    public void testMethodDeletePass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "102 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c2));
        assertEquals(true, cs.add(c3));

        assertEquals(true, cs.remove("C003"));
        assertEquals(true, cs.remove("C002"));
    }

    /* testing the delete method as a failed example */
    @Test
    public void testMethodDeleteFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "123 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(false, cs.remove("C004"));
        assertEquals(true, cs.remove("C002"));
    }

    /* testing the update method */
    @Test
    public void testUpdatePass() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "102 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(true, cs.update("C003", "Patty", "Mayonaise", "2344535999", "104 Heart St"));
        assertEquals(true, cs.update("C002", "Porkchop", "The dog", "2344535999", "100 Ohio St"));
    }

    /* testing the update method as a failed example */
    @Test
    public void testUpdateFail() {
        ContactService cs = new ContactService();
        Contact c1 = new Contact("C001", "Doug", "Funny", "2344535999", "100 Ohio St");
        Contact c2 = new Contact("C002", "Skeeter", "Valentine", "2344535999", "101 Rider St");
        Contact c3 = new Contact("C003", "Roger", "Klotz", "2344535999", "102 Michigan St");
        assertEquals(true, cs.add(c1));
        assertEquals(true, cs.add(c3));
        assertEquals(true, cs.add(c2));

        assertEquals(false, cs.update("C004", "Patty", "Mayonaise", "2344535999", ""));
        assertEquals(true, cs.update("C002", "Porkchop", "The dog", "2344535999", "100 Ohio St"));
    }

}