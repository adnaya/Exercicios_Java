
import java.util.Scanner;

public class IdadePessoas {
       private Scanner leia = new Scanner(System.in);
       
       private int ano;
       private int idade;

    public IdadePessoas() {
        this(0,0);
    }

    public IdadePessoas(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade(){
        System.out.println("Insira o ano em que você nasceu para calcular sua idade:");
        ano = leia.nextInt();
        
        idade = 2024-ano;
        
    }
    
    public void mostrarIdade(){
        System.out.println("Você possui "+getIdade()+" anos.");
    }
}
