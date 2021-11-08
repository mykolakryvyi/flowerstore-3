package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Sender;

import static org.junit.jupiter.api.Assertions.*;


class SenderTest {
    Sender sender1 = new Sender();
    @Test
    void getStatus() {
        assertEquals("Sender with id = 1 has the following status sent",sender1.getStatus("sent"));
    }
}