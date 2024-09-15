
import java.util.Scanner;

public class Dobro {
    private Scanner leia = new Scanner(System.in);
    
    private double numero;
    private double calculo;

    public Dobro() {
        this(0,0);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro(){
        System.out.println("Insira um número para descobrir seu dobro:");
        numero = leia.nextDouble();
        
        calculo = 2*numero;
        System.out.println("\nO dobro de "+getNumero()+" é "+getCalculo());
    }
    
}
