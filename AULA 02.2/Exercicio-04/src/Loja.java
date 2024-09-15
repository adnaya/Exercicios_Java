
import java.util.Scanner;


public class Loja {
    
    Scanner leia = new Scanner(System.in);
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qntdItensCompra;
    private double valorTotal;

    public Loja() {
        this("","",0,0,0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qntdItensCompra, double valorTotal) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qntdItensCompra = qntdItensCompra;
        this.valorTotal = valorTotal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQntdItensCompra() {
        return qntdItensCompra;
    }

    public void setQntdItensCompra(double qntdItensCompra) {
        this.qntdItensCompra = qntdItensCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void inserirDadosLoja(){
        System.out.println("Insira a Razão Social:");
        setRazaoSocial(leia.next());
        System.out.println("Insira o CPF do Cliente:");
        setCpfCliente(leia.next());
        System.out.println("Insira o valor da compra:");
        setValorCompra(leia.nextDouble());
        System.out.println("Insira a quantidade de itens comprados");
        setQntdItensCompra(leia.nextDouble());
        
    }
    
    public double calcularCompraLoja(){
        setValorTotal(getValorCompra()*getQntdItensCompra());
        return getValorTotal();
    }
    
    public String mostrarDadosLoja(){
        return "--- DADOS GERAIS---\nRAZÃO SOCIAL ---------- "+getRazaoSocial()+
                "\nCPF CLIENTE ----------- "+getCpfCliente()+
                "\nVALOR ----------------- "+getValorCompra()+
                "\nQUANTIDADE ------------ "+getQntdItensCompra()+
                "\nVALOR TOTAL A PAGAR --- "+getValorTotal();
    }
}
