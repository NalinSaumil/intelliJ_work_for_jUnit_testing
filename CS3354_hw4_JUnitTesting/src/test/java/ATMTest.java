import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    ATM test = new ATM();

    @Test
    void test1() {
        assertTrue(test.valid(true, 1070003683, 420.69));
    }

    @Test
    void test2() {
        assertFalse(test.valid(true, 1070003683, 420.6942));
    }

    @Test
    void test3() {
        assertTrue(test.valid(true, 1070003683, 420));
    }

    @Test
    void test4() {
        assertFalse(test.valid(true, 107000368373467325L, 420.69));
    }

    @Test
    void test7() {
        assertTrue(test.valid(true, 1070003683734673L, 420.69));
    }

    @Test
    void test10() {
        assertFalse(test.valid(false, 1070003683734673L, 420.69));
    }
}