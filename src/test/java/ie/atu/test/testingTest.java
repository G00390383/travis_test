package ie.atu.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testingTest {
    testing one;

    @BeforeEach
    void setUp(){

    }

    @Test
    void setNum(){
        one = new testing(1);
        assertEquals(1, one.getNum());
    }

    @AfterEach
    void tearDown(){

    }


}