
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private float temperature;
    
    public Heater(){
        temperature = 15;
    }
    float getTemperature(){
        return temperature;
    }
    void warmer() {
    temperature = temperature + 5;
}

    void cooler() {
    temperature = temperature - 5;
}
}