
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Temperatura temp = new Temperatura();
        Scanner leia = new Scanner(System.in);
        
        double f, c;
        
        System.out.println("Insira o valor da temperatura em Fahrenheit para calcular em Celsius:");
        f = leia.nextDouble();
        
        System.out.println("Insira o valor da temperatura em Celsius para calcular em Fahrenheit:");
        c = leia.nextDouble();
        
        temp.calcularTempCelsius(f);
        temp.calcularTempFahrenheit(c);
        
    }   
    
}