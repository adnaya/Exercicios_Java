
import java.util.Scanner;

public class Prova {
    private Scanner leia = new Scanner(System.in);
    
    private String nome;
    private double pontos;
    private String nivel;

    public Prova() {
        this("",0,"");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
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

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        System.out.println("Digite o nome:");
        setNome(leia.next());
        System.out.println("Digite a pontuação:");
        setPontos(leia.nextDouble());
        
        if(getPontos() <=100){
            setNivel(" NIVEL 1");
        }else if( (getPontos() >100) && (getPontos() <200) ){
            setNivel(" NIVEL 2");
        }else{
            setNivel(" NIVEL 3");
        }
        
    }
    
    public void listarResultado(){
        System.out.println("\n-- DADOS DO PARTICIPANTE --\nNOME: "+getNome()+
                "\nPONTOS: "+getPontos()+
                "\nNÍVEL :"+getNivel());
    }
}
