
import java.util.Scanner;

public class Passagem {
    Scanner leia = new Scanner(System.in);
    // declarar atributos de classe
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;
    
    // inicialização valores

    public Passagem() {
        this("","","","","","","");
    }
    
    // CONSTRUTOR DE CLASSE
    public Passagem(String nomePassageiro, String telefone, String RG, 
		String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }
    
    // ENCAPSULAMENTO

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    // METODOS
    public void cadastrarDadosPassageiros(){
        
        System.out.println("Insira o NOME do passageiro:");
        nomePassageiro = leia.next();
        
        System.out.println("Insira o TELEFONE do passageiro:");
        telefone = leia.next();
        
        System.out.println("Insira o RG do passageiro:");
        RG = leia.next();
        
    }
    
    public void cadastrarDadosPassagem(){
        
        System.out.println("Insira o LOCAL DA VIAGEM:");
        localViagem = leia.next();
        
        System.out.println("Insira o DATA DA VIAGEM:");
        data = leia.next();
        
        System.out.println("Insira o HORÁRIO DA VIAGEM:");
        horario = leia.next();
        
        System.out.println("Insira o NÚMERO DA POLTRONA do passageiro:");
        numPoltrona = leia.next();
    }
    
    public void mostrarDadosPassageiro(){
        System.out.println("\n----- DADOS DO PASSAGEIRO -----\n"+
                "NOME: "+getNomePassageiro().toUpperCase()+ 
                "\nTELEFONE: "+getTelefone()+
                "\nRG: "+getRG());
    }
    
    public void mostrarDadosPassagem(){
        System.out.println("\n----- DADOS PASSAGEM  -----\n"+
                "LOCAL VIAGEM: "+getLocalViagem()+
                "\nDATA: "+getData()+
                "\nHORÁRIO: "+getHorario()+
                "\nNÚMERO DA POLTRONA: "+getNumPoltrona());
    }
    
}
