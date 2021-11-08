package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;

import static org.junit.jupiter.api.Assertions.*;



class ReceiverTest {
    Receiver receiver1 = new Receiver();
    Receiver receiver2 = new Receiver();


    @Test
    void testId(){
        assertEquals(receiver1.getId(), 1);
    }

    @Test
    void getStatus() {
        assertNotEquals(receiver1, receiver2);
    }
}