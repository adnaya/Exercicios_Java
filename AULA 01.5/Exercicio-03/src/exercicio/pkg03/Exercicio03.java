
package exercicio.pkg03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        double altura, raio, volume, pi=3.14159;
        
        System.out.println("Para calcular o voume de um cilindro, insira os valores:\nRaio:");
        raio = leia.nextDouble();
        
        System.out.println("Altura:");
        altura = leia.nextDouble();
        
        volume = pi *raio*raio*altura;
        
        System.out.println("O volume desse cilindo é: "+conv.format(volume)+"cm^3");
    }
    
}
