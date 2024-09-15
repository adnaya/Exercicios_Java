
package exercicio.pkg04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        double valorAtraso, valParcela, taxa;
        int tempo;
        
        System.out.println("Insira o valor da parcela:");
        valParcela = leia.nextDouble();
        
        System.out.println("Insira o valor da taxa:");
        taxa = leia.nextDouble();
        
        System.out.println("Insira o tempo em qntd de meses atrasado:");
        tempo = leia.nextInt();
      
        
        valorAtraso = valParcela + (valParcela*(taxa/100)*tempo);
        
        System.out.println("O valor a ser pago e de: "+valorAtraso+" reais");
    }
    
}
