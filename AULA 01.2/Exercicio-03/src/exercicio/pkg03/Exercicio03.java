
package exercicio.pkg03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        String nomeProd;
        int qntd;
        double valorProd, total;        
        
        System.out.println("Insira o nome do produto:");
        nomeProd = leia.next();
        
        System.out.println("Insira o valor do produto "+nomeProd);
        valorProd = leia.nextDouble();
        
        System.out.println("Insira a quantidade de produto adicionado: ");
        qntd = leia.nextInt();
        
        total = qntd*valorProd;
        
        System.out.println("O valor total a ser pago é: "+total+" reais.");
    }
    
}
