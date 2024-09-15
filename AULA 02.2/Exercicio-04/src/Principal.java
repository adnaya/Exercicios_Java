
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Loja loj = new Loja();
        
        loj.inserirDadosLoja();
        loj.calcularCompraLoja();
        System.out.println(loj.mostrarDadosLoja());
    }
    
}
