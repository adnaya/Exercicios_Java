
import java.util.Scanner;

public class Quadrado {
    private Scanner leia = new Scanner(System.in);
    
    private double numero;
    private double resultado;

    public Quadrado() {
        this(0,0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado(){
        System.out.println("Digite um número para descobrir seu quadrado:");
        numero = leia.nextDouble();
        
        resultado = Math.pow(numero,2);
    }
    
    public void mostrarQuadrado(){
        System.out.println("O quadrado de "+getNumero()+" é "+getResultado());
    }
}
