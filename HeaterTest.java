

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
    
    public void testInit(){
       Heater Heater = new Heater(0, 500);
       float temperature = Heater.getTemperature();
       
       System.out.println("La temperatura del calentador " + temperature);
    }
    
    public void testWarmer(){
        Heater Heater = new Heater(0, 50); 
        
        System.out.println("Temperatura " + Heater.getTemperature());
        Heater.warmer(); 
        System.out.println("Temperatura final " + Heater.getTemperature());
        
    }
    
    public void testCooler(){
        Heater Heater = new Heater(0, 50);
        System.out.println("Temperatura " + Heater.getTemperature());
        Heater.warmer(); 
        System.out.println("Temperatura final " + Heater.getTemperature());
    }
    
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
    
    public void testIncrement() {
        Heater Heater = new Heater(0, 100);
        
        
        System.out.println("Incremento inicial: 5.0");
        
        
        float intentoNegativo = -15;
        System.out.println("cambiando valores: " + intentoNegativo);
        Heater.setIncrement(intentoNegativo);
        Heater.warmer(); 
        
        System.out.println("temperatura final: " + Heater.getTemperature());
        
        if(Heater.getTemperature() == 20.0) {
             System.out.println("se ignoro el valor negativo");
        } else {
             System.out.println("error valor negativo¿¿¿");
        }
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
