
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private float temperature;
    private float min;
    private float max;
    private float increment;
    
    public Heater(float tempMin, float tempMax){
        temperature = 15;
        max = tempMax;
        min = tempMin;
        increment = 5;
    }
    float getTemperature(){
        return temperature;
    }
    void warmer() {
    if ((temperature + increment) <= max){    
    temperature = temperature + increment;
}
}

    void cooler() {
    temperature = temperature - increment;
}
}