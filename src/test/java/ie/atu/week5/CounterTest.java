package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter myCounter;


    @BeforeEach
    void setUp() {
        myCounter = new Counter();
    }

    @Test
    void testIncrement()
    {
        assertEquals(1, myCounter.increment());
    }

    @Test
    void testConstructor(){
        Exception exception_message = assertThrows(IllegalArgumentException.class, () -> {new Counter(4);});
        assertEquals("NOT VALID NUMBER", exception_message.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}