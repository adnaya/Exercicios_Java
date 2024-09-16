
import java.util.Scanner;

public class Temperatura {
    
    Scanner leia = new Scanner(System.in);
    
    private double celsius;
    private double fahrenheit;
	
    public Temperatura() {
        this(0.0,0.0);
    }

    public Temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public void calcularTempCelsius(double f){
        this.setCelsius((f-32)*(5.0/9.0));
        System.out.println("TEMPERATURA EM CELSIUS: "+getCelsius());
    }
    
    public void calcularTempFahrenheit(double c){
        this.setFahrenheit((c*1.8) + 32);
        System.out.println("TEMPERATURA EM FAHRENHEIT: "+getFahrenheit());
    }
}

