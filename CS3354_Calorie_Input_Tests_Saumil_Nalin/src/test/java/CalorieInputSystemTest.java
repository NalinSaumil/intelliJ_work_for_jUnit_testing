import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalorieInputSystemTest {
    CalorieInputSystem userIn = new CalorieInputSystem();

    @Test
    void test1() {
        assertTrue(userIn.isValid("Breakfast","Calories In", 350));
    }

    @Test
    void test2() {
        assertFalse(userIn.isValid("Breakfast","Calories In", -40));
    }

    @Test
    void test3() {
        assertFalse(userIn.isValid("Breakfast","Food Search", 450));
    }

    @Test
    void test4() {
        assertFalse(userIn.isValid("Breakfast","Food Search", -40));
    }

    @Test
    void test6() {
        assertFalse(userIn.isValid("Breakfast","Saved Recipe", 550));
    }

    @Test
    void test7() {
        assertFalse(userIn.isValid("Breakfast","dgkqwd", 450));
    }

    @Test
    void test9() {
        assertTrue(userIn.isValid("Lunch","Calories In", 350));
    }

    @Test
    void test17() {
        assertTrue(userIn.isValid("Dinner","Calories In", 450));
    }

    @Test
    void test25() {
        assertTrue(userIn.isValid("Snack","Calories In", 250));
    }

    @Test
    void test33() {
        assertFalse(userIn.isValid("dgugwekuf","Calories In", 600));
    }
}