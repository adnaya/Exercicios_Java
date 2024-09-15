
import java.util.Scanner;

public class Cliente {
    Scanner leia = new Scanner(System.in);    
    private String nome;
    private String endereco;
    private String rg;

    public Cliente() {
        this("","","");
    }

    public Cliente(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    // metodos
    public void cadastrarCliente(){
        
        System.out.println("Insira o nome do Cliente:");
        nome = leia.next();
        
        System.out.println("Insira o endereço do Cliente:");
        endereco = leia.next();
        
        System.out.println("Insira o RG do Cliente:");
        rg = leia.next();
        
    }
    
    public void listarCliente(){
        
        System.out.println("\n- DADOS CLIENTE -\n"+
                "Nome: "+getNome().toUpperCase()+
                "\nEndereço: "+getEndereco()+
                "\nRG: "+getRg());
    }
}
