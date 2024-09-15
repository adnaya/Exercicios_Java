
import java.util.Scanner;

public class Multiplicacao {
    private Scanner leia = new Scanner(System.in);
    
    private int valor;
    private int resultado;

    public Multiplicacao() {
        this(0,0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4(){
        System.out.println("Digite o valor a ser multiplicado por 4:");
        valor = leia.nextInt();
        
        resultado = valor*4;
    }
    
    public void mostrarMultiplicacao(){
        System.out.println("O resultado da multiplicação de "+getValor()+" por 4 é: "+getResultado());
    }
    
    
}
