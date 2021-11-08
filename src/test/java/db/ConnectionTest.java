package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection connect1;
    private Connection connect2;

    @BeforeEach
    void setUp() {
        connect1 = Connection.getConnection();
        connect2 = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertEquals(connect1, connect2);
    }
}