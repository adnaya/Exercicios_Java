
import java.util.Scanner;

public class Cliente {
    private Scanner leia = new Scanner(System.in);
    
    private String nome;
    private double numeroConta;
    private double saldoMedio;

    public Cliente() {
        this("",0,0);
    }

    public Cliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        System.out.println("Digite o Nome do Cliente:");
        setNome(leia.nextLine());
        System.out.println("Digite o número da Conta:");
        setNumeroConta(leia.nextDouble());
        System.out.println("Digite o Saldo Médio da Conta:");
        setSaldoMedio(leia.nextDouble());
        
        if(getSaldoMedio() < 1000){
            System.out.println("Cliente COMUM");
        }else if( (getSaldoMedio() >=1000) && (getSaldoMedio() <2500) ){
            System.out.println("Cliente PRATA");
        }else{
            System.out.println("Cliente OURO");
        }
    }
    
}
