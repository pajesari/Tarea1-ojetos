

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
       float temperature = Heater.getTemperature();
       
       System.out.println("La temperatura del calentador " + temperature);
    }
    @Test
    public void testWarmer(){
        Heater Heater = new Heater(0, 50); 
        
        System.out.println("Temperatura " + Heater.getTemperature());
        Heater.warmer(); 
        System.out.println("Temperatura final " + Heater.getTemperature());
        
    }
    @Test
    public void testCooler(){
        Heater Heater = new Heater(0, 50);
        System.out.println("Temperatura " + Heater.getTemperature());
        Heater.warmer(); 
        System.out.println("Temperatura final " + Heater.getTemperature());
    }
    @Test
    public void testcantBeWarmer(){
        Heater Heater = new Heater(0, 50);
        
        System.out.println("temperatura de inicio " + Heater.getTemperature());
        
        Heater.warmer(); 
    System.out.println("despues del primer imcremento" + Heater.getTemperature());
        
        Heater.warmer(); 
        System.out.println("despues del segundo incremento" + Heater.getTemperature());
        
        
    }
    public void testcantBeCooler(){
        Heater Heater = new Heater(0, 50);
        
        System.out.println("temperatura de inicio " + Heater.getTemperature());
        
        Heater.warmer(); 
    System.out.println("despues del primer decremento" + Heater.getTemperature());
        
        Heater.warmer(); 
        System.out.println("despues del segundo decremento " + Heater.getTemperature());
        
        
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
    

    @Test
    public void prueba()
    {
    }
}
