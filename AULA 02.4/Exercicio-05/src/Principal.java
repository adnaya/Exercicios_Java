
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        Combustivel comb = new Combustivel();
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        double km, valorComb;
        
        System.out.println("Insira o valor de km rodados");
        km = leia.nextDouble();
       
        comb.calcularLitros(km);
        
        System.out.println("Insira o valor do combustível");
        valorComb = leia.nextDouble();
        
        System.out.println("VALOR TOTAL GASTO: "+conv.format(comb.calcularTotalGasto(valorComb))+" reais.");
        
    }
    
}
