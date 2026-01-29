

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeaterTest
{
    /**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest()
    {
    }
    @Test
    public void testInit(){
       Heater Heater = new Heater(0, 500);
       assertEquals(15, Heater.getTemperature(), .1);
    }
    @Test
    public void testWarmer(){
        Heater Heater = new Heater(0, 500);
        Heater.warmer();
        assertEquals(20, Heater.getTemperature(), 1);
        
        
    }
    @Test
    public void testCooler(){
        Heater Heater = new Heater(0, 500);
        Heater.cooler();
        assertEquals(10, Heater.getTemperature(), 1);
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
}