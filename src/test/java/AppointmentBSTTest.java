
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentBSTTest {
    @Test
    public void testAddAppointment() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient", "09:00");
        bst.addAppointment(p1);
        assertNotNull(bst.getRoot());
    }

    @Test
    public void testInsertRecWithDuplicateTimes(){
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient1", "09:00");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient2", "12:00");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient3", "03:00");
        PatientAppointment p4 = new PatientAppointment(4, "Test Patient4", "09:00");
        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.addAppointment(p4);
        bst.inOrderTraversal(bst.getRoot());
        assertNotNull(bst.getRoot());
        assertNotNull(bst.getRoot().left);
        assertNotNull(bst.getRoot().right);
    }

    @Test
    public void testInsertRecWithMoreThanThreeAppointments() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient1", "16:50");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient2", "14:03");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient3", "15:38");
        PatientAppointment p4 = new PatientAppointment(4, "Test Patient4", "17:00");
        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.addAppointment(p4);
        bst.inOrderTraversal(bst.getRoot());
        assertNotNull(bst.getRoot());
        assertNotNull(bst.getRoot().left);
        assertNotNull(bst.getRoot().right);
        assertNotNull(bst.getRoot().left.right);
    }
    @Test
    public void testInsertRecWithSameTimeForAllAppointments() {
        AppointmentBST bst = new AppointmentBST();
        PatientAppointment p1 = new PatientAppointment(1, "Test Patient1", "23:00");
        PatientAppointment p2 = new PatientAppointment(2, "Test Patient2", "23:00");
        PatientAppointment p3 = new PatientAppointment(3, "Test Patient3", "23:00");
        bst.addAppointment(p1);
        bst.addAppointment(p2);
        bst.addAppointment(p3);
        bst.inOrderTraversal(bst.getRoot());
        assertNotNull(bst.getRoot());
        assertNull(bst.getRoot().left);
        assertNull(bst.getRoot().right);
    }

}
