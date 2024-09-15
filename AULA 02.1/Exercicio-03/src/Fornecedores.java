
import java.util.Scanner;

public class Fornecedores {
    Scanner leia = new Scanner(System.in);
       private String nomeFornecedor;
       private String nomeProd;
       private String descricaoProd;

    public Fornecedores() {
        this("","","");
    }

    public Fornecedores(String nomeFornecedor, String nomeProd, String descricaoProd) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProd = nomeProd;
        this.descricaoProd = descricaoProd;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }
    
    // metodos
    
    public void cadastrarFornecedor(){
        System.out.println("Nome do Fornecedor:");
        nomeFornecedor = leia.nextLine();
        
        System.out.println("Produto:");
        nomeProd = leia.nextLine();
        
        System.out.println("Descrição Produto:");
        descricaoProd = leia.nextLine();
        
    }
    
    public void listarFornecedor(){
        System.out.println("\n-- DADOS FORNECEDOR --\n"+
                "Fornecedor: "+getNomeFornecedor().toUpperCase()+
                "\nProduto: "+getNomeProd().toUpperCase()+
                "\nDescrição: "+getDescricaoProd().toUpperCase());
    }
}
