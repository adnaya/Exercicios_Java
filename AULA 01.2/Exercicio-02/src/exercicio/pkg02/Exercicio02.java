
package exercicio.pkg02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        double valorPago, numLitros;
        
        System.out.println("CALCULE VALOR A SER PAGO DO COMBUSTÍVEL\nInsira a quantidade em litros utilizada:");
        numLitros = leia.nextDouble();
        
        valorPago = (double) (numLitros * 5.89);
        
        System.out.println("O valor a ser pago será de: R$"+valorPago);
    }
    
}
