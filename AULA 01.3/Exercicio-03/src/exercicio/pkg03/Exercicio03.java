
package exercicio.pkg03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        int movVendido, salTotal;
        
        System.out.println("Insira a quantidade de móveis vendidos:");
        movVendido = leia.nextInt();
        
        salTotal = 1000 + (movVendido*50);
        
        System.out.println("MÓVEIS VENDIDOS:"+movVendido+"\n Salário Total Vendedor: "+salTotal+" reais.");
    }
    
}
