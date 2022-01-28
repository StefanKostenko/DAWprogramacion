public class Heater {
    
    //Atributos
    private double temperature;
    private double min;
    private double max;
    private double increment;


    //Setter Increment
    public void setIncrement(double increment) {
        if(increment >= 1.0 && increment <= 5.0){
            this.increment = increment;
        }
    }

    //Consturcot
    public Heater(double temperature, double min, double max) {
        this.temperature = temperature;
        this.min = min;
        this.max = max;
        this.increment = 5.0;
    }

    //Mutador
    public void warmer(){
        double temperatureIncrement = temperature + increment;
        if(temperatureIncrement <= max){
            temperature = temperature + increment;
        }
    }

    public void cooler(){
        double temperatureReducida = temperature - increment;
        if(temperatureReducida >= min){
            temperature = temperature - increment;
        }
    }

    //Metodos
    public void printTemperature(){
        System.out.println(temperature);
    }

}
