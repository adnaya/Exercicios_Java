
import java.util.Scanner;

public class OlimpiadaMatematica {
        private Scanner leia = new Scanner(System.in);
        
        private String nome;
        private String endereco;
        private double media;
        private double notaMenor;
        private double notaMaior;

    public OlimpiadaMatematica() {
        this("","",0,0,0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notaMenor, double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(double notaMaior) {
        this.notaMaior = notaMaior;
    }
        
    public void calcularMedia(){
        System.out.println("Insira o Nome:");
        setNome(leia.nextLine());
        System.out.println("Insira o Endereço:");
        setEndereco(leia.nextLine());
        System.out.println("Insira o valor da menor nota:");
        setNotaMenor(leia.nextDouble());
        System.out.println("Insira o valor da maior nota:");
        setNotaMaior(leia.nextDouble());
        
        setMedia( (getNotaMenor()+getNotaMaior()) /2 );        
        System.out.println("O valor da media foi:"+getMedia());
    }
    
    public void verificarMedia(){
        if(getMedia()>9){
            System.out.println("ALUNO INSCRITO");
        }else{
            System.out.println("MÉDIA INSUFICIENTE");
        }
    }
              
}

